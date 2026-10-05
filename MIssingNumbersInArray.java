package HashTable;

import java.util.*;

public class MIssingNumbersInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers(nums);
        System.out.print("Disappeared numbers in the array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
