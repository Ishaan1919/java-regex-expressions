package bridgelabz.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        String regex = "http(s)?://(www.)?([\\w.-]+\\.[a-z]{2,})";
        String test = "Websites: https://www.google.com, example.org and https://github.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        while(matcher.find()) {
            System.out.println("Extracted Dates✅: " + matcher.group());
        }
    }
}
