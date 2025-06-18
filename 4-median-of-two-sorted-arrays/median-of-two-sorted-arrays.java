class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int n1 = 0, n2 = 0, curr = 0;
        
        while (n1 < nums1.length && n2 < nums2.length) {
            if (nums1[n1] <= nums2[n2]) {
                nums3[curr++] = nums1[n1++];
            } else {
                nums3[curr++] = nums2[n2++];
            }
        }
        while (n1 < nums1.length) {
            nums3[curr++] = nums1[n1++];
        }
        while (n2 < nums2.length) {
            nums3[curr++] = nums2[n2++];
        }
        
        int total = nums3.length;
        if (total % 2 == 1) {
            return nums3[total / 2];
        } else {
            return (nums3[total / 2 - 1] + nums3[total / 2]) / 2.0;
        }
    }
}