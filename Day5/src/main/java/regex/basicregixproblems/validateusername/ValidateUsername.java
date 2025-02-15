package regex.basicregixproblems.validateusername;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a username to check :");
        String text = input.nextLine();

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

       if(matcher.matches()){
           System.out.println("Valid Username");
       }else{
           System.out.println("Not a Valid Username");
       }

    }
}
