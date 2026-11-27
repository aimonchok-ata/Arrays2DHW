public class Task15 {
    public static void main(String[] args) {

        int[] prices = {120, 45, 80, 30, 55};

        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }

        // (double) нужен, чтобы деление не отбрасывало дробную часть
        double average = (double) total / prices.length;

        System.out.println("Total: " + total + "; average: " + average);
    }
}
