package solution;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Number of flowers that can be planted

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) { // Empty plot
                boolean prevEmpty = (i == 0 || flowerbed[i - 1] == 0); // Check previous plot
                boolean nextEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0); // Check next plot

                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1; // Plant a flower
                    count++;
                }
            }
        }

        return count >= n;
    }
  
}
