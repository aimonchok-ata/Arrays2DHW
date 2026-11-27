public static void main(String[] args) {


    int[][] matrix = {
            {5, 1, 4},
            {2, 8, 3},
            {9, 6, 7}
    };
    System.out.print("{ ");
    for (int i = 0; i < 2; i++) {
        System.out.print("{ ");
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.print("}");
        if (i < 1) {
            System.out.print(", ");
        }
    }
    System.out.print(" }");
}
    }
    System.out.print(" }");
    for (int i = 0; i < 3; i++) {
        int rowSum = 0; // для каждой строки считаем сумму заново с нуля
        for (int j = 0; j < 3; j++) {
            rowSum = rowSum + matrix[i][j];
        }
        System.out.println("Row " + (i + 1) + " sum: " + rowSum);
    }
}







