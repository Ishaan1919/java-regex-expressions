package bridgelabz.basicRegexProblems;

import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        String test = "A12345  AB1234";
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
