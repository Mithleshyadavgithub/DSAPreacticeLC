class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        for(int right =1; right<nums.length; right++){
            if(nums[right]!=nums[l]){
                l++;
                nums[l]=nums[right];
            }

        }
        return l+1;
        
        
    }
}