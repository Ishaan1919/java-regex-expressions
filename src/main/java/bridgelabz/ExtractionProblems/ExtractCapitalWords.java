package bridgelabz.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {
    public static void main(String[] args) {
        String regex = "[A-Z][a-z]*";
        String test = "A The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        while(matcher.find()){
            System.out.println("Valid Capital words✅: " + matcher.group());
        }
    }
}
