class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int revNum=0;
        while(x>0){
            int d=x%10;
            x=x/10;
            revNum=(revNum*10)+d;
        }
        if(revNum==t){
            return true;
        }
        return false;
    }
}