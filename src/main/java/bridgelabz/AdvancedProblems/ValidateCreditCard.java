package bridgelabz.AdvancedProblems;

import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String regexCredit = "^4[0-9]{15}$";
        String regexMaster = "^5[\\d]{15}$";
        String test = "4847284938762146  5847284938762146";
        String[] arr = test.split("\\s+");
//        Pattern patternCredit = Pattern.compile(regexCredit);
//        Pattern patternMaster = Pattern.compile(regexMaster);

        for(String i: arr){
            if(i.matches(regexCredit)){
                System.out.println(i + " → ✅ Valid credit card number");
            }
            else if(i.matches(regexMaster)){
                System.out.println(i + " → ✅ Valid master card number");
            }
            else{
                System.out.println(i + " → ❌ Invalid");
            }
        }
    }
}
