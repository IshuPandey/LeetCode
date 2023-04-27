// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.
 class Solution {
    public int lengthOfLastWord(String s) {

        String[] string=s.split(" ");
          int maxLength = string[0].length() ;
            int i;
      for(i=0;i<string.length-1;i++);
       return string[i].length();
        
    }
}