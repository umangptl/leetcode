package solution;

public class ReverseWords {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split the string into an array of words
        String[] words = s.split("\\s+");

        // Reverse the array of words
        reverseArray(words);

        // Join the reversed array of words into a single string
        return String.join(" ", words);
    }

    private void reverseArray(String[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    
}
