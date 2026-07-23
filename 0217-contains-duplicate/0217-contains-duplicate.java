class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1){
            return false;
        }
        // if(nums.length==0){
        //     return false;
        // }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;        
    }   
}