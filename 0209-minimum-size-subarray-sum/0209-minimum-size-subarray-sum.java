class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int k= Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;

        while(j<n){ // for (int j = 0; j < nums.length; j++)
            sum+=nums[j];
            
            while(sum>=target){
              k= Math.min(k,j-i+1);
              sum-=nums[i];
              i++;
            
            }
            j++;
        }
        return k == Integer.MAX_VALUE ? 0 : k;

        
    }
}