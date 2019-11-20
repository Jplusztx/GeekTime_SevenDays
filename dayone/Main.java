package dayone;


class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0,fast;
        int length = nums.length;
        if (length <= 1) return length;
        for (fast = 0; fast < length; fast++) {
            if (nums[slow]!=nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,2};
        System.out.println(solution.removeDuplicates(nums));
    }
}
