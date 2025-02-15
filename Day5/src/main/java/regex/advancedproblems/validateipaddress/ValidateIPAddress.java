package regex.advancedproblems.validateipaddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a IP Address to check :");
        String text = input.nextLine();

        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|\\d)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|\\d)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|\\d)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|\\d)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("Valid ");
        }else{
            System.out.println("InValid");
        }
    }
}

