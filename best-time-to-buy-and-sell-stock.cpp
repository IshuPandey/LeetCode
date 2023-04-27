// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int max1=0;
        int left=0,right=1;
        while(right<prices.size())
        {
            int currprofit=prices[right]-prices[left];
             if (prices[left] < prices[right])
                max1 =max(currprofit,max1);
             else
                left=right;
                right++;   

        }
        return max1;
        
    }
};