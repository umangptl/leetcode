package solution;

import java.util.HashMap;

public class RomanToInt {
    
    public int romanToInt(String s) {
        // Create a HashMap to store the mapping of Roman numerals to their values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0; // Variable to store the final integer value
        int length = s.length(); // Length of the input Roman numeral string
        int i = 0; // Index to iterate through the string

        // Iterate through the characters of the input string
        while (i < length) {
            int currentValue = map.get(s.charAt(i)); // Get the value of the current character

            // Check if there is a next character
            int nextValue = (i + 1 < length) ? map.get(s.charAt(i + 1)) : 0;

            // Compare the current value with the next value
            if (currentValue < nextValue) {
                // If the current value is less than the next value, subtract it from the result
                result -= currentValue;
            } else {
                // If the current value is greater than or equal to the next value, add it to the result
                result += currentValue;
            }

            i++; // Move to the next character
        }

        return result; // Return the final integer value
    }
}