class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n=s.length();
        int n2=t.length();
        if(n!=n2){
            return false;
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<n2;i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))!=0){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }   else{
                return false;
            }
            }
            else{
                return false;
            }
        }
        return true;

    }
}