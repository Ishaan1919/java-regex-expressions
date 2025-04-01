package bridgelabz.basicRegexProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {


    public static void main(String[] args) {
//        String regex = "[a-zA-Z]\\w{4,14}";
        String regex = "^[a-zA-Z][\\w]{4,14}$";
        String test = "hello_124 olleh _help239 23hello__ he__llo19191";
        String[] arr = test.split("\\s+");
        Pattern pattern = Pattern.compile(regex);

        for(String i: arr){
            if(i.matches(regex)){
                System.out.println(i + " → ✅ Valid");
            }
            else{
                System.out.println(i + " → ❌ Invalid");
            }
        }
    }
}
