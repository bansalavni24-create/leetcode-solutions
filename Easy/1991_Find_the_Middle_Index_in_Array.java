class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum=0;
        int totsum=0;
        for(int i=0;i<nums.length;i++){
            totsum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            totsum=totsum-nums[j];
            if(totsum==leftsum){
                return j;  
            }
            leftsum+=nums[j];
        }
       return -1;     
    }
}