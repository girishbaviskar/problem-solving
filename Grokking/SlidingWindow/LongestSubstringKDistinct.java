import java.util.*;
public class LongestSubstringKDistinct {
    public static int findLength(String str, int k) {
        if (str == null || str.length() < k ) {
            throw new IllegalArgumentException();
        }

        int winStart = 0, maxLen = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int winEnd = 0; winEnd < str.length(); winEnd++) {
            char rightChar = str.charAt(winEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1 );

            while (charFrequencyMap.size() > k) {
                char leftChar = str.charAt(winStart);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1 );
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                winStart++;
            }
            maxLen = Math.max(maxLen, winEnd - winStart + 1);
        }


        return maxLen;
      }
     
      public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
      }
}
