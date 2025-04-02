package bridgelabz.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String regex = "([\\w]+)(\\s+)(\\1)";
        String test = "This is is a repeated repeated word test.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        while(matcher.find()){
            System.out.println("Extracted repeated words ✅: " + matcher.group(1)); // .group(1) this 1 returns the first capturing group and 0 returns the entire string
        }
    }
}
