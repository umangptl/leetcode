package solution;

public class GreatestCommonDivisorStrings {
    public String gcdOfStrings(String str1, String str2) {
        // Check if there is a common prefix
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD using Euclidean algorithm
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    

}
