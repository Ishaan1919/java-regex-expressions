package bridgelabz.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)[0-9]{2})";
        String test = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/9020.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);

        while(matcher.find()){
            System.out.println("Extracted Dates✅: " + matcher.group());
        }
    }
}
