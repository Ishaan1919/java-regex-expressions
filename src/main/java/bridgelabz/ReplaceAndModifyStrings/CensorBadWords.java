package bridgelabz.ReplaceAndModifyStrings;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] bad = {"Stupid","damn"};
        String ans = text;
        for(String i:bad){
            // "(?i) this is to check case sensitivity, means makes the regex expression case sensitive"
            ans = ans.replaceAll("(?i)" + i,"****");
        }

        System.out.println("Original String: " + text);
        System.out.println("Replaced String: " + ans);
    }
}
