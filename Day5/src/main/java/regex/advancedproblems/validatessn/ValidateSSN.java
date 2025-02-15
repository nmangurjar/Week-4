package regex.advancedproblems.validatessn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN to check :");
        String text = input.nextLine();

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("Valid ");
        }else{
            System.out.println("InValid");
        }

    }
}
