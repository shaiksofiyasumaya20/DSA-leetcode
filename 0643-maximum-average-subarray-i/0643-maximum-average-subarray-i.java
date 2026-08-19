class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];

        }
        double maxAvg=sum/k;
        for(int right=k;right<n;right++)
        {
            sum=sum-nums[left]+nums[right];
            left++;
            double currentAvg=sum/k;
            maxAvg=Math.max(maxAvg,currentAvg);
        }
        return maxAvg;
    }
}