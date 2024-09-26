import java.util.Scanner;

public class MadLibsAdvanced {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // MadLibs Strings
        String madLib1 = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        String madLib2 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        String madLib3 = "The <adjective> <noun> <verb> the <adjective> <noun>.";

        fillMadLib(madLib1);
        fillMadLib(madLib2);
        fillMadLib(madLib3);

    }

    public static void fillMadLib(String madLib) {
        // Find the first missing word
        // Using String.contains() method
        // while (madLib1.contains("<")) {
        // Using only AP methods
        while (madLib.indexOf("<") != -1) {
            // Find the missing word type
            int openBracketIndex = madLib.indexOf("<");
            int closeBracketIndex = madLib.indexOf(">");
            String wordType = madLib.substring(openBracketIndex + 1, closeBracketIndex);
            // Ask the user for the missing word
            System.out.println("Enter a " + wordType + ":");
            String userInput = scanner.nextLine();
            // Replace the missing word
            // Using String.replace() method
            // madLib1 = madLib1.replace("<" + wordType + ">", userInput);
            // Using only AP methods
            String firstPart = madLib.substring(0, openBracketIndex);
            String lastPart = madLib.substring(closeBracketIndex + 1);
            madLib = firstPart + userInput + lastPart;
        }

        // Print out the final MadLib
        System.err.println(madLib);
    }

}
