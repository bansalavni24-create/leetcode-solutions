class Solution {
public:
    int climbStairs(int n) {
        int sum;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
       } 
       return sum;
    }
};