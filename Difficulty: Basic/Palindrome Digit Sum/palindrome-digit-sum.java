class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        
        while(n!= 0){
            sum += n%10;
            n = n/10;
        }
        
        if(sum < 10){
            return true;
        }
        
        int originalSum = sum;
        int reversedSum = 0;

        while (sum > 0) {
            int lastDigit = sum % 10;
            reversedSum = (reversedSum * 10) + lastDigit;
            sum = sum / 10;
        }
        
        return originalSum == reversedSum;
    }
}