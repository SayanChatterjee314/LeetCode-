class Solution {
    public boolean isPalindrome(int x) {
        int c=x,sum =0;
        while(x>0){
            int reminder = x%10;
            sum=(sum*10)+reminder;
            x=x/10;
        }
        if(c==sum){
            return true;
        }
        else return false;

    }
}