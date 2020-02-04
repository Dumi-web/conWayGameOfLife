/*
public class way {
        public static void main(String[] args)
        {
            int M = 3, N = 10;
            String output = "#";

            // Intiliazing the grid.
            String[][] grid = { { "+", "+", "+", "+", "+", "+", "+", "+", "+", "+" },
                    { "+", "+", "+", "#", "#", "+", "+", "+", "+", "+" },
                    { "+", "+", "+", "+", "#", "+", "+", "+", "+", "+" },
            };

            // Displaying the grid
            System.out.println("Original Generation");
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (!grid[i][j].equals(output))
                        System.out.print("+");
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
            nextGeneration(grid, M, N);
        }

        // Function to print next generation
        static void nextGeneration(String grid[][], int M, int N)
        {
            String out = "#";
            String outcome = "+";
            char[][] future = new char[M][N];

            // Loop through every cell
            for (int l = 1; l < M - 1; l++)
            {
                for (int m = 1; m < N - 1; m++)
                {
                    // finding no Of Neighbours that are alive
                    String aliveNeighbours = "";
                    for (int i = -1; i <= 1; i++)
                        for (int j = -1; j <= 1; j++)
                            aliveNeighbours += grid[l + i][m + j];

                    // The cell needs to be subtracted from
                    // its neighbours as it was counted before
                    */
/*aliveNeighbours = grid[l][m];

                    // Implementing the Rules of Life

                    // Cell is lonely and dies
                    if ((grid[l][m].equals(out)) && (aliveNeighbours < 2))
                        future[l][m]

                        // Cell dies due to over population
                    else if ((grid[l][m].equals(out)) && (aliveNeighbours > 3))
                        future[l][m] = ;

                        // A new cell is born
                    else if ((grid[l][m].equals(outcome)) && (aliveNeighbours == 3))
                        future[l][m] = ;

                        // Remains the same
                    else
                        future[l][m] = grid[l][m];
                }
            }*//*


            System.out.println("Next Generation");
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (future[i][j] == 0)
                        System.out.print("+");
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
        }
    }

*/
