package dayfour;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0){
            for (;n>0;n--){
                nums1[n-1]=nums2[n-1];
            }
            return;
        }
        if (n == 0){
            return;
        }
        if (nums1[m-1] > nums2[n-1]){
            nums1[m+n-1] = nums1[m-1];
            merge(nums1,m-1,nums2,n);
        }else {
            nums1[m+n-1] = nums2[n-1];
            merge(nums1,m,nums2,n-1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        solution.merge(nums1,m,nums2,n);
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i]+"\t");
        }
    }
}
