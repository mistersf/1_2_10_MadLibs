import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // MadLibs Strings
        String madlib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        // madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // madlib = "The <adjective> <noun> <verb>.";

        // Find the first missing word
        int openBracketIndex = madlib.indexOf("<");
        int closeBracketIndex = madlib.indexOf(">");
        String wordType = madlib.substring(openBracketIndex + 1, closeBracketIndex);
        // Ask the user for the missing word
        System.out.println("Enter a " + wordType + ":");
        String userInput = scanner.nextLine();
        // Replace the missing word
        String firstPart = madlib.substring(0, openBracketIndex);
        String lastPart = madlib.substring(closeBracketIndex + 1);
        madlib = firstPart + userInput + lastPart;

        // Find the second missing word
        openBracketIndex = madlib.indexOf("<");
        closeBracketIndex = madlib.indexOf(">");
        wordType = madlib.substring(openBracketIndex + 1, closeBracketIndex);
        // Ask the user for the missing word
        System.out.println("Enter a " + wordType + ":");
        userInput = scanner.nextLine();
        // Replace the missing word
        firstPart = madlib.substring(0, openBracketIndex);
        lastPart = madlib.substring(closeBracketIndex + 1);
        madlib = firstPart + userInput + lastPart;

        // Find the third missing word
        openBracketIndex = madlib.indexOf("<");
        closeBracketIndex = madlib.indexOf(">");
        wordType = madlib.substring(openBracketIndex + 1, closeBracketIndex);
        // Ask the user for the missing word
        System.out.println("Enter a " + wordType + ":");
        userInput = scanner.nextLine();
        // Replace the missing word
        firstPart = madlib.substring(0, openBracketIndex);
        lastPart = madlib.substring(closeBracketIndex + 1);
        madlib = firstPart + userInput + lastPart;

        // Print out the final MadLib
        System.err.println(madlib);
    }
}
