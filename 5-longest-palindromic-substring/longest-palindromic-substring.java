class Solution {
    public boolean isPalindrome(String s, int i, int j){
        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(isPalindrome(s,i,j) == true){
                    if((j-i+1) > max){
                        max = j - i + 1;
                        start = i;
                        end = j;

                    }        
                }
            }
        }
        return s.substring(start, end+1);
    }
}