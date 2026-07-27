class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(n==rev){
            return true;
        }
        else{
            return false;
        }
    }
}