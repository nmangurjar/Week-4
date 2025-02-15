package regex.basicregixproblems.validatelicenseplate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a License Number plate to check :");
        String text = input.nextLine();

        String regex = "^[A-Z]{2}\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){
            System.out.println("Valid License Number plate ");
        }else{
            System.out.println("Not a Valid License Number plate ");
        }
    }
}
