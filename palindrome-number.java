class Solution {
public:
    bool isPalindrome(int num) {
      if(num<0)
        return false;
        
        int n = num;
        int digit;
       long int rev=0;

     do
     {
         digit = num % 10;
         rev = (rev * 10) + digit;
         num = num / 10;
     } while (num != 0);
        if(n==rev)
            return true;
        else
            return false;
        
        
       
    }
};