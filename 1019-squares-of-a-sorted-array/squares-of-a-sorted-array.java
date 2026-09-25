class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
      int ans[]=new int[nums.length];
        while(i<=j){
            
            if(Math.abs(nums[i])<
Math.abs(nums[j])){
                ans[k]=nums[j] *nums[j];
                j--;
            }
            else{
                ans[k] =  nums[i] * nums[i];
                i++;
            }
             k--;
        }
       
        return ans;
    }
}