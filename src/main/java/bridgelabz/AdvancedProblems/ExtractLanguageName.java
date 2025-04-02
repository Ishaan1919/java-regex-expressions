package bridgelabz.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguageName {
    public static void main(String[] args) {
        String regex = "(?i)(java|python|go|javascript|c\\+\\+)";
        String test = "I love Java,c++, Python, and JavaScript, but I haven't tried Go yet.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        while(matcher.find()){
            System.out.println("Valid Language Names✅: " + matcher.group());
        }
    }
}
