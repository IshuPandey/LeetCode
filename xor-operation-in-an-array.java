// You are given an integer n and an integer start.

// Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

// Return the bitwise XOR of all elements of nums.

class Solution {
    public int xorOperation(int n, int start) {
        int [] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=start+(2*i);
        }
        int xor=array[0];
        for(int i =1;i<n;i++)
        {
            xor=xor^array[i];
        }
        return xor;
    }
}