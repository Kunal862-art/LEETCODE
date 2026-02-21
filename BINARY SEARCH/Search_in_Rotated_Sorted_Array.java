class Solution {
    public int search(int[] nums, int target) {
        int z=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                z = i;
                break;
            }
        }
        return z;
    }
}