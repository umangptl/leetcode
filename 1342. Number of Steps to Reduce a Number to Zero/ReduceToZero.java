package solution;

public class ReduceToZero {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                // If the number is even, divide it by 2
                num /= 2;
            } else {
                // If the number is odd, subtract 1
                num -= 1;
            }

            steps++;
        }

        return steps;
    }
    }