package regex.extractionproblems.extractcapitalizedwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWord {
    public static void main(String[] args) {
        String regex = "[A-Z][a-z]*";
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
    }

