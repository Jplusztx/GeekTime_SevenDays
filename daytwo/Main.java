package daytwo;

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k%length;
        int[] num = new int[k];
        for (int j = length-1; j >= 0; j--){
            if (j+k>=length)
                num[(j+k)%length] = nums[j];
            else
                nums[j+k] = nums[j];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = num[i];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        solution.rotate(nums,3);
        for (int a : nums) {
            System.out.print(a+"\t");
        }
    }
}
