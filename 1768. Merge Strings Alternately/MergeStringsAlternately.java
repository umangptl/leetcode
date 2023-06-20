package solution;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining characters of word1
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        // Append remaining characters of word2
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
    
}
