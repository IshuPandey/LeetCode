// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.

 
class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int flag=0,pivot;
        for(int i=0;i<size(nums);i++)
        {
            pivot=i;
            int leftsum=0,rightsum=0;
            int j=0;
            while(j<pivot)
            {
                leftsum+=nums[j];
                j++;
            }
                j=pivot+1;
            while(j<size(nums))  
            {
                rightsum+=nums[j] ;
                j++;
            }
            if(leftsum==rightsum)
            {
                flag=1;
                return pivot;
               
            }     
        }
        
           return -1;    

        
    }
};