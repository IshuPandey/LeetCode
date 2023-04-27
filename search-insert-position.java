// Given a sorted array of distinct integers and a target value, return the index if the target is found.
//  If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

class Solution {
    public int searchInsert(int[] nums, int target) {
       int res=0; int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
               res=i;
                flag=1;
               
            }
        }
        if(flag==0)
        {
             for(int i=0;i<nums.length;i++)
             {
                
             if(nums[i]>target)
            {
                    res=i;
                 break;
               
            }
                 if(i==nums.length-1)
                     res=nums.length;
             if(nums[i]<target)
                    continue;
             }
        }
            
        
        return res;
    }
}