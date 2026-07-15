class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=left;
            left*=nums[i];
        }
        int right=1;
        for(int j=nums.length-1;j>=0;j--){
            ans[j]=ans[j]*right;
            right*=nums[j];
        }
        return ans;
    }
}  
