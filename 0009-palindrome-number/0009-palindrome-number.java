class Solution {
    public boolean isPalindrome(int x) {
        int num =0;
int orignal = x;
        while(x>0){
            int temp= x%10;
            num= num*10+temp;
            x=x/10;
        }
     if(orignal==num) return true;
    else return false;
    }
}