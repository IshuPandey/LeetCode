
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
         int count1=0,count2=0,count3=0;

         for(int i=0;i<s.length();i++)
          {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            
                count1++;
                
             if(s.charAt(i)=='[' || s.charAt(i)==']')
                count2++; 
              if(s.charAt(i)=='{' || s.charAt(i)=='}')
                count3++;  
          }  
          if(count1%2!=0 || count2%2!=0 || count3%2!=0)
                return false;
          else
            return true;      

    }
}