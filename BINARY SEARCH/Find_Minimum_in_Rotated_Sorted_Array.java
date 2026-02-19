class Solution {
    public int findMin(int[] nums) {
        int z = Integer.MAX_VALUE;
        for(int i:nums){
            if(i<z){
                z=i;
            }
        }
        return z;
    }
}