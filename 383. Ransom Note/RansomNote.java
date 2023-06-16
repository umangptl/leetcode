package solution;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create a map to store the frequency of each letter in the magazine
        Map<Character, Integer> magazineFreq = new HashMap<>();

        // Count the frequency of each letter in the magazine
        for (char c : magazine.toCharArray()) {
            magazineFreq.put(c, magazineFreq.getOrDefault(c, 0) + 1);
        }

        // Check if the ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (magazineFreq.containsKey(c) && magazineFreq.get(c) > 0) {
                // Decrement the frequency of the letter in the magazine
                magazineFreq.put(c, magazineFreq.get(c) - 1);
            } else {
                // Letter not found in the magazine or frequency is already 0
                return false;
            }
        }

        // All letters in the ransomNote can be constructed from the magazine
        return true;
    }
}

