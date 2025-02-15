package junit.basicjunittestproblems.testingstringutility;

public class StringUtils {
    public String reverse(String str){
        return new StringBuilder(str).reverse().toString();


    }
    public boolean isPalindrome(String str){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String toUpperCase(String str){
        return str.toUpperCase();
    }
}
