package bridgelabz.AdvancedProblems;

import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^(([0-9]{1}|[1-9]{1,2}|[1][0-9]{2}|25[0-5]|2[0-4][0-9])\\.){3}([0-9]{1}|[1-9]{1,2}|[1][0-9]{2}|25[0-5]|2[0-4][0-9])$";
        String test = "200.233.94.259";
        String[] arr = test.split("\\s+");
        Pattern pattern = Pattern.compile(regex);

        for(String i: arr){
            if(i.matches(regex)){
                System.out.println(i + " → ✅ Valid IP address");
            }
            else{
                System.out.println(i + " → ❌ Invalid IP address");
            }
        }
    }
}
