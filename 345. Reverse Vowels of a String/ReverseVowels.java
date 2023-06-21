package solution;

public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (isVowel(charArray[start]) && isVowel(charArray[end])) {
                // Swap the vowels
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                start++;
                end--;
            } else if (isVowel(charArray[start])) {
                // Only end is a non-vowel, move end pointer backward
                end--;
            } else {
                // Only start is a non-vowel, move start pointer forward
                start++;
            }
        }

        return new String(charArray);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    
}
