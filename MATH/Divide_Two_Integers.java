class Solution {
    public int divide(int dividend, int divisor) {
        int z = dividend/divisor;
        if(z==Integer.MIN_VALUE && divisor<0){
            return Integer.MAX_VALUE;
        }
        else{
            return z;
        }
    }
}