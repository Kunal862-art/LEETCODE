class Solution {
    public int reverse(int x) {
        int y;
        int z=0;
        if(x>=Integer.MAX_VALUE || x<=Integer.MIN_VALUE){
            return 0;
        }
        else{
            if(x>0){
                while(x!=0){
                    y=x%10;
                    if(z>Integer.MAX_VALUE/10){
                        return 0;
                    }
                    z=z*10+y;
                    x=x/10;
                }
            }
            else{
                x = x*(-1);
                while(x!=0){
                    y=x%10;
                    if(z>Integer.MAX_VALUE/10){
                        return 0;
                    }
                    z=z*10+y;
                    x=x/10;
                }
                z=z*(-1);
            }
            return z;
        }
    }
}