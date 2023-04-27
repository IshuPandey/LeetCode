// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

 
 class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sumarr;
        for(int i=0;i<size(nums);i++)
        {
            int sum=0;
            for(int j=0;j<=i;j++)
            {
                sum+=nums[j];

            }
            sumarr.emplace_back(sum);
        }
        return sumarr;

        
    }
};