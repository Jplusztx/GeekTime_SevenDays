package daysix;

class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        digits[length-1] += 1;
        for (int i = length-1; i > 0; i--) {
            if (digits[i] == 10){
                digits[i-1] += 1;
                digits[i] = 0;
            }else
                break;
        }
        if (digits[0] == 10){
            digits[0] = 0;
            int[] nums = new int[length+1];
            nums[0] = 1;
            for (int i = 1; i < length + 1; i++) {
                nums[i] = digits[i-1];
            }
            return nums;
        }
        return digits;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
