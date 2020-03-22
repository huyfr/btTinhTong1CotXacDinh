import java.util.Scanner;


public class SumColumn {

    static int column = 0;

    public static int sizeMatrix(String type) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        int result = 0;
        try {
            if (type.equals("rows")) {
                do {
                    System.out.print("Enter the rows number of the matrix: ");
                    rows = sc.nextInt();
                    if (rows > 10) {
                        System.out.println("The rows of the matrix does not exceed 10");
                    }
                } while (rows > 10);
                result = rows;
            } else if (type.equals("columns")) {
                do {
                    System.out.print("Enter the columns number of the matrix: ");
                    columns = sc.nextInt();
                    if (columns > 10) {
                        System.out.println("The columns of the matrix does not exceed 10");
                    }
                } while (columns > 10);
                result = columns;
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return result;
    }

    public static void addValues(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        try {
            for (int rows = 0; rows < matrix.length; rows++) {
                for (int columns = 0; columns < matrix[rows].length; columns++) {
                    System.out.print("Enter element [" + rows + "][" + columns + "]: ");
                    matrix[rows][columns] = sc.nextInt();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void display(int[][] matrix, String type) {
        int sum = 0;
        try {
            if (type.equals("displayMatrix")) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    for (int columns = 0; columns < matrix[rows].length; columns++) {
                        System.out.print(matrix[rows][columns] + "\t");
                    }
                    System.out.println();
                }
            } else if (type.equals("displaySum")) {
                sum = sumOfColumn(matrix);
                System.out.print("Sum of the column number " + (column + 1) + " :" + sum);
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public static int columnOfMatrix(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        try {
            System.out.print("Enter a column number: ");
            int column = sc.nextInt();
            if (column < 0 || column > matrix.length) {
                result = -1;
            } else {
                result = column;
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return result;
    }

    public static int sumOfColumn(int[][] matrix) {
        int sum = 0;
        try {
            column = columnOfMatrix(matrix) - 1;
            for (int row = 0; row < matrix[0].length; row++) {
                sum = sum + matrix[row][column];
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return sum;
    }
}
