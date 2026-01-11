class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = nums.length;
        while (k < j) {
            if (nums[k] == val) {
                nums[k] = nums[j - 1];
                j--;
            } else {
                k++;
            }
        }
        return k;
    }
}