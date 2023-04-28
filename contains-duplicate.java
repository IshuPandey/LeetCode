// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int flag=0;
        Arrays.sort(nums);
        int i=0;
        while(i!=nums.length-1)
        {
            if(nums[i]==nums[i+1])
                return true;
           
            i++;    
           
        }
        
                return false;    

        
        
    }
}