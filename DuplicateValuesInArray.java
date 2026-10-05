package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateValuesInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {

            if (set.contains(num)) {
                result.add(num);
            } else {
                set.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDuplicates(nums);
        System.out.print("Duplicate values in the array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
