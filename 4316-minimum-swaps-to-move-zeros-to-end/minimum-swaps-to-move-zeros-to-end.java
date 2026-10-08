class Solution {
    public int minimumSwaps(int[] nums) {
        int i = 0, j = nums.length - 1, count = 0;

        while (i < j) {
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                count++;
                i++;
                j--;
            } else if (nums[i] != 0) {
                i++;
            } else {
                j--;
            }
        }

        return count;
    }
}