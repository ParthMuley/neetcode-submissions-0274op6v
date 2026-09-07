class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int targetIndex = totalLength / 2;
        int[] merged = new int[targetIndex + 1];

        int i = 0;
        int j = 0;
        int k = 0;

        while (k <= targetIndex) {
                     if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        if (totalLength % 2 == 0) {
            return (merged[targetIndex - 1] + merged[targetIndex]) / 2.0;
        }

        return merged[targetIndex];
    }
}