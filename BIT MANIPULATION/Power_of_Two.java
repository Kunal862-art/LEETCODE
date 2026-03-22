class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean y=false;
        int z=0;
        int a=0;
        while(n>0){
            a=n%2;
            z = z*10 + a;
            n=n/2;
        }
        if(z==1){
            y = true;
        }
        return y;
    }
}