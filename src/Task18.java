import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {

        int[] a = {8, 3, 9, 1, 5, 2};
        int[] b = {8, 4, 9, 0, 5, 7};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int matches = 0;
        // сравниваем элементы с одинаковым индексом
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                matches++;
            }
        }

        System.out.println("Matches: " + matches);
    }
}

