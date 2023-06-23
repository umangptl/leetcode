package solution;

import java.util.Arrays;

public class StringCompression {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 1;
            read++;

            while (read < chars.length && chars[read] == currentChar) {
                count++;
                read++;
            }

            chars[write] = currentChar;
            write++;

            if (count > 1) {
                String countString = String.valueOf(count);
                for (char digit : countString.toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }
        }

        return write;
    }

    
}
