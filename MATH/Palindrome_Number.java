class Solution {
    public boolean isPalindrome(int x) {
        boolean z = false;
        int a = 0;
        int b = x;
        if(x==0){
            z=true;
        }
        else if(x>0){
            while(b>0){
                a = (a*10) + b%10;
                b = b/10;
            }
        }
        if(a==x){
            z = true;
        }
        return z;
    }
}