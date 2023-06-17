package solution;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Iterate over each customer's bank accounts
        for (int[] customerAccounts : accounts) {
            int wealth = 0;

            // Calculate the wealth of the current customer
            for (int account : customerAccounts) {
                wealth += account;
            }

            // Update the maximum wealth if necessary
            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}
