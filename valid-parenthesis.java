// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

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