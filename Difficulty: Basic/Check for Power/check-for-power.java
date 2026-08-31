class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if(y == 1){
            return true;
        }if (x == 1){
           return false;
            
        }
        while(y%x == 0){
            y = y/x;
        }
        return y == 1;
    }
}