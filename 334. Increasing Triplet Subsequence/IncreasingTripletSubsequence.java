package solution;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int medium = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= medium) {
                medium = num;
            } else {
                return true;
            }
        }

        return false;
    }
    
}
