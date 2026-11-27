import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];

        for (int i = 0; i < scores.length; i++) {
            int score = -1;
            // повторяем вопрос, пока не введут целое число от 0 до 100
            while (score < 0 || score > 100) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                if (sc.hasNextInt()) {
                    score = sc.nextInt();
                } else {
                    sc.next(); // пропускаем то, что не является числом
                    score = -1;
                }
                if (score < 0 || score > 100) {
                    System.out.println("Wrong value! Enter an integer from 0 to 100.");
                }
            }
            scores[i] = score;
        }

        int passed = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                passed++;
            }
        }

        System.out.println("Passed: " + passed);
        sc.close();
    }
}
