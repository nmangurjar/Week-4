package regex.advancedproblems.validatecreditcard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Credit card no. to check :");
        String text = input.nextLine();

        String regexVisa = "^4[0-9]{15}$";
        String regexMaster = "^5[0-9]{15}$";

        Pattern pattern = Pattern.compile(regexVisa);
        Pattern pattern2 = Pattern.compile(regexMaster);
        Matcher matcher1 = pattern.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);

        if(matcher1.matches()){
            System.out.println("Valid Visa Card");
        }
        else if(matcher2.matches()){
            System.out.println("Valid Master Card");
        }else{
            System.out.println("InValid");
        }
    }
}
