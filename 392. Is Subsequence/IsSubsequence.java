package solution;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0; // Pointer for string s
        int p2 = 0; // Pointer for string t

        while (p1 < s.length() && p2 < t.length()) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
            }
            p2++;
        }

        return p1 == s.length();
    }

    
}
