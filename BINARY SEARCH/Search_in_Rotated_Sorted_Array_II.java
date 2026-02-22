class Solution {
    public boolean search(int[] nums, int target) {
        boolean z = false;
        for(int i:nums){
            if(i==target){
                z = true;
            }
        }
        return z;
    }
}