public class LongestPalindromeTest {
    
//    @Test
//    public void testPalindrome() {
//        String test = "namanaabbbbbfdnamanlowhhhhhhhdfdWasitacatIsawffffffffffffff";
//        assertEquals("wasitacatisaw", palindrome(test));
//    }
//    
//    @Test
//    public void testNoPalindrome() {
//        String test = "how are you";
//        assertEquals("h", palindrome(test));
//    }
//    
//    @Test
//    public void testOddCase() {
//        String test = "natan";
//        assertEquals("natan", palindrome(test));
//    }
//    
//    @Test
//    public void testEvenCase() {
//        String test = "Missisipi";
//        assertEquals("issi", palindrome(test));
//    }
    
    static String palindrome(String test) {
        test = test.toLowerCase();
        char[] testArray = test.toCharArray();
        
        //maxLength to record length of the longest palindrome
        int maxLength = 1;
        
        //Variable to record end position of the longest palindrome
        int maxHigh = 0;
        
        //Variable to record the start position of Longest palindrome
        int maxLow = 0;
        
        //Looping variables
        int low = -1;
        int high = 0;
        
        /*
         * Approach:
         * Traverse the string
         * low = k -1
         * high = k
         * default max length is 1
         * As we traverse the string we check char at String k and k+1 with low
         * If it matches with k+1, then we increment high by 1 unit
         * If there is match
         * then we loop through the string by matching char[high] == char[low]
         * as we loop we increment high and decrement low
         * we then match the palindrome substring length(high - low + 1) with maxLength
         * If the palindrome length is more than maxLength, we update the maxLenth
         * Also, record the high and low values as start and end point if the palindrome substring
         * We loop till, first mismatch or end of string
         * Once we finish traversal, we return maxLenth and substring from low to high as the longest palindrome substring
         */
        for (int k=0; k < testArray.length; k++) {
            high = k;
            //For odd palindrome strings
            if (low >= 0 && high < testArray.length-1 
                    && (testArray[high + 1] == testArray[low])) {
                high++;
            }
            
            //Palindrome search
            while (low >= 0 && high < testArray.length
                    && testArray[high] == testArray[low]) {
                if ((high - low + 1) > maxLength) {
                    maxLength = (high - low) + 1;
                    maxHigh = high;
                    maxLow = low;
                }
                high++;
                low--;
                k = high - 1;
            }
            low = k;
        }
        return test.substring(maxLow, maxHigh+1);
    }
    
    //evacaniseebeesinacave
    
    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        //String palindromeString ="namanaabbbbbfdnamanjhhhhhhhdfdWasitacatIsawfffffffffff";
        String palindromeString ="wasitacatIsawredrumsirismurderevacaniseebeesinacave";
//        System.out.println(longestPalindrome.findLongestPalindrome(palindromeString));
        System.out.println(palindrome(palindromeString));
    }
}