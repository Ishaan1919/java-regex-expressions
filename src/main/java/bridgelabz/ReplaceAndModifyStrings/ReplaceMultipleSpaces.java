package bridgelabz.ReplaceAndModifyStrings;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "Olleh everyone   in    the room  how's it          going";
        String replaceString = text.replaceAll("\\s+"," ");
        System.out.println("Original String: " + text);
        System.out.println("Replaced String: " + replaceString);
    }
}
