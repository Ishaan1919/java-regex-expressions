package bridgelabz.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValue {
    public static void main(String[] args) {
        String regex = "[$]?[\\d]+\\.?[\\d]+";
        String test = "The price is $45.99, and 1493 the discount is 10.50 100.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        while(matcher.find()){
            System.out.println("Extracted currency value ✅: " + matcher.group());
        }
    }
}
