package regex.extractionproblems.extractemailsfromtext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailsFromText {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        String text = "Contact us at support@example.com and info@company.org";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
