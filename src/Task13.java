import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = {12, 7, 3, 9, 7, 15, 4, 20};


        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Enter a value to find: ");
        while (!sc.hasNextInt()) {
            System.out.print("This is not an integer. Try again: ");
            sc.next();
        }
        int value = sc.nextInt();

        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Index: " + index);
        }
        sc.close();
    }
}