package bridgelabz.basicRegexProblems;

import java.util.regex.Pattern;

public class ValidateHexCode {
    public static void main(String[] args) {
        String regex = "#[0-9a-fA-F]{6}";
        String test = "#123 #ff4500 #FFA500";
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
