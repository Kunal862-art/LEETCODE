class Solution {
    public int hammingWeight(int n) {
        int z=0;
        int a=0;
        while(n>0){
            a=n%2;
            if(a==1){
                z+=1;
            }
            n=n/2;
        }
        return z;
    }
}
