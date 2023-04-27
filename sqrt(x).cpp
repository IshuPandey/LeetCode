// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
//  The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

class Solution {
public:
    int mySqrt(int n) {
        if (n < 2) {
        return n;
    }
    long low = 1, high = n;
    while (low <= high) {
        long mid = (low + high) / 2;
        if (mid * mid == n) {
            return mid;
        } else if (mid * mid < n) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return ceil(high);
        
    }
};