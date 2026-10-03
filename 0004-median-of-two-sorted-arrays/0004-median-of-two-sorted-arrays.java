class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;

        int total = nums1.length + nums2.length;
        int previous = 0;
        int current = 0;

        for (int count = 0; count <= total / 2; count++) {

            previous = current;

            if (i < nums1.length &&
                (j >= nums2.length || nums1[i] <= nums2[j])) {

                current = nums1[i];
                i++;

            } else {

                current = nums2[j];
                j++;
            }
        }

        if (total % 2 == 1)
            return current;

        return (previous + current) / 2.0;
    }
}