class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        if( n<26){
            return false;
        }
        boolean[] check=new boolean[26];

        for(int i=0;i<n;i++){
            char C=sentence.charAt(i);
            check[C-'a']=true;
            
            
        }

        for(int i=0;i<26;i++){
            if(check[i]==false){
                return false;
            }
            
        }
        return true;
    }
}