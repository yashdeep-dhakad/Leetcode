class Solution {
    public boolean isPalindrome(String s) {

        String S=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n=S.length();
        int i=0;
        int j=n-1;

        while(i<n/2){
            if(S.charAt(i)!=S.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}