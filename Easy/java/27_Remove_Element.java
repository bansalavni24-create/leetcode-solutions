class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length;
        int j=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    k-=1;
                }
                else if(nums[i]!=val){
                    nums[j]=nums[i];
                    j++;
                } 
        }
        return k;
    }
}