import java.util.Arrays;

public class conWayGameOfLife {
    // Function to print next generation
    static String nextGeneration(String[][] grid, int Rows, int Cols) {
        String aliveNeighbours = "";
        String out = "#";
        String[][] future = new String[Rows][Cols];
        StringBuilder results =new StringBuilder();

        // Loop through every cell
        for (int l = 0; l < Rows; l++) {
            for (int m = 0; m < Cols; m++) {
                        try {
                                //top neighbour
                                if (grid[(l) - 1][m].equals(out)) {
                                    aliveNeighbours += out;
                                }
                        }catch(ArrayIndexOutOfBoundsException ignore){

                        }
                        try {
                                //bottom neighbour
                                if (grid[(l) + 1][m].equals(out)) {
                                    aliveNeighbours += out;
                                }
                        }catch (ArrayIndexOutOfBoundsException ignore){

                        }
                        //bottom right neighbour
                        try {
                            if (grid[(l) + 1][(m) + 1].equals(out)) {
                                aliveNeighbours += out;
                            }
                        } catch (ArrayIndexOutOfBoundsException ignore) {

                        }
                        //bottom left neighbour
                        try {
                            if (grid[(l) + 1][(m) - 1].equals(out)) {
                                aliveNeighbours += out;
                            }
                        } catch (ArrayIndexOutOfBoundsException ignore) {

                        }
                        //top left neighbour
                        try {
                            if (grid[(l) - 1][(m) - 1].equals(out)) {
                                aliveNeighbours += out;
                            }
                        } catch (ArrayIndexOutOfBoundsException ignore) {

                        }
                        //top right neighbour
                        try {
                            if (grid[(l) - 1][(m) + 1].equals(out)) {
                                aliveNeighbours += out;
                            }
                        } catch (ArrayIndexOutOfBoundsException ignore) {

                        }
                        try {
                                //right neighbour
                                if (grid[l][(m) + 1].equals(out)) {
                                    aliveNeighbours += out;
                                }
                        }catch(ArrayIndexOutOfBoundsException ignore){

                        }
                        try {
                                //left neighbour
                                if (grid[l][(m) - 1].equals(out)) {
                                    aliveNeighbours += out;
                                }
                        } catch (ArrayIndexOutOfBoundsException ignore) {

                        }
                        if(grid[l][m].equals("#")&& aliveNeighbours.length()<2){
                                future[l][m] = "+";
                        }
                        else if(aliveNeighbours.length() == 3){
                                future[l][m] = "#";

                        }
                        else if(grid[l][m].equals("#") && aliveNeighbours.length()>3){
                                future[l][m] = "+";
                        }
                        else if(grid[l][m].equals("#")&& aliveNeighbours.length()==2){
                            future[l][m] = "#";
                        }else{
                            future[l][m] = grid[l][m];
                        }
                        aliveNeighbours = "";
                    }
                }
                        for(String [] a: future){
                            results.append(Arrays.toString(a)).append("\n");
                            System.out.println(Arrays.toString(a));
                        }
                    return results.toString();
            }
        }


