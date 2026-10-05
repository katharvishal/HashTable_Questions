package HashTable;

import java.util.HashSet;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        int result = missingNumber(nums);
        System.out.println("Missing number: " + result);
    }
    
}
