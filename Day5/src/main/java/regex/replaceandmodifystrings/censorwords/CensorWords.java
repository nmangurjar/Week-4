package regex.replaceandmodifystrings.censorwords;

public class CensorWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String regex = "damn";
        String regex2 = "stupid";
        String replacedText = text.replaceAll(regex,"****");
        replacedText = replacedText.replaceAll(regex2,"****");

        System.out.println(replacedText);

    }
}
