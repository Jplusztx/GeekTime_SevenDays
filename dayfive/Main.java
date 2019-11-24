package dayfive;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[] { map.get(complement), i };
            else map.put(nums[i], i);
        }
        return new int[2];
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] arr = solution.twoSum(nums,target);
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
}
