package HashTable;

public class HashMapImp {
    class Node{
        int key;
        int value;
        Node next;
        
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    Node[] bucket;
    int size;
    
    HashMapImp(int size){
        this.size = size;
        this.bucket = new Node[size];
    }

    public int hash(int key){
        return key % size;
    }

    public void put(int key, int value){
        int index = hash(key);
        Node head = bucket[index];

        while(head != null){
            if(head.key == key){
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = bucket[index];
        bucket[index] = newNode;

    }

    public void get(int key){
        int index = hash(key);
        Node head = bucket[index];

        while(head != null){
            if(head.key == key){
                System.out.println("Element at" + key + "key is" + head.value);
                return;
            }
            head = head.next;
        }
        System.out.println("Elemtent not found at" + key + "key");

    }

    public void remove(int key){
        int index = hash(key);
        Node current = bucket[index]; // head = bucket[index]

        if(current.key == key){
            bucket[index] = current.next;
            return;
        }

        while(current.next != null){
            if(current.next.key == key){
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {

        HashMapImp map = new HashMapImp(10);

        map.put(21, 100);
        map.put(22, 200);
        map.put(23, 300);
        map.put(24, 400);
        map.put(25, 500);
        map.put(32, 600);
        map.put(42, 700);

        // map.get(21);

        // map.get(32);

        map.remove(32);

        map.get(32);
    }
}
