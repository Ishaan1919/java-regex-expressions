package bridgelabz.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddresses {
    public static void main(String[] args) {
        String regex = "[a-zA-Z][\\w.%+-]+@[a-zA-Z]+\\.[a-z]{2,}";
        String test = "Contact us at support@example.com and info@company.org";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        while(matcher.find()){
            System.out.println("Valid Email Address✅: " + matcher.group());
        }
    }
}
