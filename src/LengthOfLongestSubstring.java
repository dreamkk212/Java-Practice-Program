import java.util.HashSet;
import java.util.Set;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
// abcab
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> characterSet = new HashSet<>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!characterSet.contains(c)) {
                characterSet.add(c);
            } else {
                max = Math.max(max, characterSet.size());
                while (start < i && s.charAt(start) != c) {
                    characterSet.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
        }
        max = Math.max(max, characterSet.size());
        return max;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("length" + lengthOfLongestSubstring("pwwkew"));
    }

}
