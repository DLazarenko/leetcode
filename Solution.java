class Solution {
    
    public int removeDuplicates(int[] nums) {
        int position = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]  != nums[i-1]){
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
} 