class Solution {
    boolean palindrome(String s){
        int n=s.length();
        StringBuilder ne = new StringBuilder(n);

        for(int i=n-1;i>=0;i--){
            char c= s.charAt(i);
                ne.append(c);
        }
        return s.equals(ne.toString());
    }
    public String firstPalindrome(String[] words) {
        
int n = words.length;

for(int i=0;i<n;i++){
   boolean j= palindrome(words[i]);
   if(j== true){
    return words[i];
   }
}
return "";
    }
}