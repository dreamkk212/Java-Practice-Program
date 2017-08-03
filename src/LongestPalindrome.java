import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome {

    public String findLongestPalindrome(String s) {
        List<String> listSubStrings = findSubstrings(s);
        Map<Integer, String> listPalindromes = findPalindromes(listSubStrings);
        Set<Integer> listKey = listPalindromes.keySet();
        String longestPalindrome = listPalindromes.get((listKey.toArray())[listKey.size() - 1]);
        return longestPalindrome;
    }

    // {a},{a,a},{a,a,b}
    public List<String> findSubstrings(String palindromeString) {
        List<String> listSubStrings = new ArrayList<String>();
        for (int i = 0; i < palindromeString.length() - 1; i++) {
            for (int j = 0; j <=i ; j++) {
                    if (isPalindrome(palindromeString.substring(j,i+1)))
                        listSubStrings.add(palindromeString.substring(j, i+1));
            }
        }
        System.out.println(Arrays.toString(listSubStrings.toArray()));
        return listSubStrings;
    }

    public boolean isPalindrome(String string) {
        if (string.equals((new StringBuilder(string).reverse().toString()))) {
            return true;
        }
        return false;
    }

    public Map<Integer, String> findPalindromes(List<String> listSubStrings) {
        Map<Integer, String> palindromMap = new HashMap<>();
        for (int i = 0; i < listSubStrings.size() - 1; i++) {
            palindromMap.put(listSubStrings.get(i).length(), listSubStrings.get(i));
        }
        return palindromMap;
    }
    
    public String findLongPalindrome(String s) {
        String longest = null;
        longest = s.substring(0, 1);
        for(int i=0; i<=s.length()-1; i++) {
            String tmp = helperMethod(s,i,i);
            if(tmp.length() > longest.length()) {
                longest = tmp;
            }
             tmp = helperMethod(s,i,i+1);
            if(tmp.length() > longest.length()) {
                longest = tmp;
            }
            
        }
        return longest;
    }
    
    private String helperMethod(String s, int before, int after) {
        while(before >=0 && after <= s.length() -1 && s.charAt(before) == s.charAt(after)) {
           before--;
           after++;
        }
        return s.substring(before +1 , after);
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        //String palindromeString ="namanaabbbbbfdnamanjhhhhhhhdfdWasitacatIsawfffffffffff";
        String palindromeString ="wasitacatIsawredrumsirismurderevacaniseebeesinacave";
//        System.out.println(longestPalindrome.findLongestPalindrome(palindromeString));
        System.out.println(longestPalindrome.findLongPalindrome(palindromeString));
    }
}
