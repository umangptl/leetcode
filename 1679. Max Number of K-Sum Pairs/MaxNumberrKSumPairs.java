package solution;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberrKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxOperations = 0;

        for (int num : nums) {
            int target = k - num;
            if (freqMap.containsKey(target) && freqMap.get(target) > 0) {
                maxOperations++;
                freqMap.put(target, freqMap.get(target) - 1);
            } else {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }

        return maxOperations;
    }

}
