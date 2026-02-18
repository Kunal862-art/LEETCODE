class Solution {
    public int findMin(int[] nums) {
        int z = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<z){
                z=nums[i];
            }
        }
        return z;
    }
}