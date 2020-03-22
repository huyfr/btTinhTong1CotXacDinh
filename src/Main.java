public class Main {
    public static void main(String[] args) {
        int[][] matrix=new int[SumColumn.sizeMatrix("rows")][SumColumn.sizeMatrix("columns")];
        SumColumn.addValues(matrix);
        SumColumn.display(matrix, "displayMatrix");
        SumColumn.display(matrix, "displaySum");
    }
}