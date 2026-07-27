class Solution {
public:
    int maxProduct(vector<int>& nums) {
        if(nums.size()==2){
            return (nums[0]-1)*(nums[1]-1);
        }
        for(int i=0;i<nums.size()-1;i++){
            for(int j=0;j<nums.size()-i-1;j++){
                if(nums[j]<nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return (nums[0]-1)*(nums[1]-1);
    }
};