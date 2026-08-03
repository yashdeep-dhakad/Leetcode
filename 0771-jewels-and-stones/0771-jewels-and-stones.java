class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length();
        int count=0;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            char C=stones.charAt(i);
            if(map.containsKey(C)){
                map.put(C,map.get(C)+1);
            }
            else{
                map.put(C,1);}
        }

        for(int i=0;i<jewels.length();i++){
            char C=jewels.charAt(i);
            if(map.containsKey(C)){
                int J=map.get(C);
                count=count+J;
            }
        }
        return count;
    }
}