package Exercise7;

public class FinancialForecasting {
    
    // Method to calculate future value using a recursive approach
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if no more years left, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: calculate the future value for the remaining years
        return predictFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        double initialValue = 1000.0;  // initial value of the investment
        double growthRate = 0.05;      // annual growth rate (5%)
        int years = 10;                // number of years to forecast

        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future value after " + years + " years: $" + futureValue);
    }
}