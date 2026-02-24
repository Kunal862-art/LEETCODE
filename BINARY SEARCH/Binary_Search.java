class Solution {
    public int search(int[] nums, int target) {
        int z=-1;
        if(nums[nums.length/4]>=target){
            for(int i=0;i<=nums.length/4;i++){
                if(nums[i]==target){
                    z = i;
                    break;
                }
            }
        }
        else if(nums[nums.length/2]>target){
            for(int i=nums.length/4;i<nums.length/2;i++){
                if(nums[i]==target){
                    z = i;
                    break;
                }
            }
        }
        else if(nums[(3*nums.length)/4]>target){
            for(int i=nums.length/2;i<(3*nums.length)/4;i++){
                if(nums[i]==target){
                    z = i;
                    break;
                }
            }
        }
        else if(nums[nums.length-1]>=target){
            for(int i=((3*nums.length)/4);i<nums.length;i++){
                if(nums[i]==target){
                    z = i;
                    break;
                }
            }
        }
        return z;
    }
}