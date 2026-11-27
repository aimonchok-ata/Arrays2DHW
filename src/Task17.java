public class Task17 {
    public static void main(String[] args) {

        int[] a = {7, 2, 9, 4, 11, 5};
        int[] doubled = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            doubled[i] = a[i] * 2;
        }

        System.out.print("Original: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Doubled: ");
        for (int i = 0; i < doubled.length; i++) {
            System.out.print(doubled[i] + " ");
        }
        System.out.println();
    }
}