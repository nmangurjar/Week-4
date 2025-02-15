package junit.basicjunittestproblems.testingstringutility;

public class Main {
    public static void main(String[] args) {
        StringUtils s = new StringUtils();
            String str = "Naman";
        System.out.println("Reversed String : "+s.reverse(str));
        System.out.println("Is Pallindrome : "+s.isPalindrome(str));
        System.out.println("To Uppercase : "+s.toUpperCase(str));
    }
}
