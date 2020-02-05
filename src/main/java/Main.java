import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int Rows = 10, Cols = 10;

        String[][] grid = {{"+", "+", "#", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "#", "#", "#", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}
        };

        // Displaying the grid
        System.out.println("Original Generation");
        for(String[] print:grid){
            System.out.println(Arrays.toString(print));
        }

        System.out.println();
        conWayGameOfLife.nextGeneration(grid, Rows, Cols);
    }
}
