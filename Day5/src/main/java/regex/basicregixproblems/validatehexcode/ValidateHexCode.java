package regex.basicregixproblems.validatehexcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Hex Color Code to check :");
        String text = input.nextLine();

        String regex = "^#[a-fA-F0-9]{6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("Valid ");
        }else{
            System.out.println("InValid");
        }
    }
}
