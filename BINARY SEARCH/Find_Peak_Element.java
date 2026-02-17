class Solution {
    public int findPeakElement(int[] nums) {
        int z = Integer.MIN_VALUE;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>z){
                z=nums[i];
                y=i;
            }
        }
        return y;
    }
}