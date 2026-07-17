class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max_avg=-Double.MAX_VALUE;
        int n=nums.length;
        int i=0;
        int j=0;
        

        while(j<n){
            sum=sum+nums[j];

            if (j-i+1<k){
                j++;
            }
            else if(j-i+1==k){

                max_avg=Math.max(sum/k,max_avg);
                sum=sum-nums[i];
                i++;
                j++;
            }
            
        }
        return max_avg;
    }
}