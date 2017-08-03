import java.util.Arrays;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class ReverseWords {

    private String reverseWords(String message) {

        String[] words = message.split(" ");
        String reverseWordsMessage = "";

        for (int i = words.length -1; i >=0; i--) {
            reverseWordsMessage = reverseWordsMessage + words[i] + " ";
        }

        return reverseWordsMessage;
    }
    
    private String reverseWordsByCharacter(String message) {
        char[] stringChar = message.toCharArray();
        System.out.println("stringChar" + Arrays.toString(stringChar));
        int messageArrayStartPoint = 0;
        int messageArrayEndPoint = stringChar.length-1;
        stringChar = reverseCharacterString(stringChar,messageArrayStartPoint,messageArrayEndPoint);
        System.out.println("stringChar" + Arrays.toString(stringChar));
        messageArrayStartPoint = 0;
        messageArrayEndPoint = stringChar.length;
        int currentWordStartIndex = 0;
        while(messageArrayStartPoint <= messageArrayEndPoint) {
        
            if(messageArrayStartPoint == stringChar.length || stringChar[messageArrayStartPoint] == ' ') {
                reverseCharacterString(stringChar,currentWordStartIndex,messageArrayStartPoint-1);
                currentWordStartIndex = messageArrayStartPoint + 1;
            }
            messageArrayStartPoint++;
        }
        
        return new String(stringChar);
    }
    
    private char[] reverseCharacterString(char[] characterArray, int startPointCharArray, int endPointCharArray) {
        while(startPointCharArray < endPointCharArray) {
            char temp=characterArray[endPointCharArray];
            characterArray[endPointCharArray] = characterArray[startPointCharArray];
            characterArray[startPointCharArray] =temp;
            startPointCharArray++;
            endPointCharArray--;
        }
        
        return characterArray;
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String message = "find you will pain only go you recordings security the into if";
        System.out.println("message" + message + " || reverseWords || " + reverseWords.reverseWordsByCharacter(message));

    }

}
