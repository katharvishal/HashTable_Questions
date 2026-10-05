package HashTable;

import java.util.HashSet;

public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};

        boolean result = containsDuplicate(nums);
        System.out.println("Array contains duplicates: " + result);
    }
}
