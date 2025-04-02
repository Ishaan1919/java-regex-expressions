package bridgelabz.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidSocialSecurityNumber {
    public static void main(String[] args) {
        String regexCredit = "^\\d{3}-\\d{2}-\\d{4}$";
        String test = "123-45-6789 123456789";
        String[] arr = test.split("\\s+");

        for(String i: arr){
            if(i.matches(regexCredit)){
                System.out.println(i + " → ✅ Valid Social Security Number");
            }
            else{
                System.out.println(i + " → ❌ Invalid");
            }
        }
    }
}
