package solution;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        // Create a new list to store the result
        List<String> answer = new ArrayList<>();

        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // If i is divisible by both 3 and 5, add "FizzBuzz" to the result
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                // If i is divisible by 3, add "Fizz" to the result
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                // If i is divisible by 5, add "Buzz" to the result
                answer.add("Buzz");
            } else {
                // If none of the above conditions are true, add i as a string to the result
                answer.add(Integer.toString(i));
            }
        }

        // Return the result
        return answer;
    }
    
}
