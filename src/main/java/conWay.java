/*
public class conWay {
    public static void main(String[] args)
    {
        int R = 3, C = 10;
        String output = "+";
        String [][] grid = { { "+", "+", "+", "+", "+", "+", "+", "+", "+", "+" },
                             { "+", "+", "+", "#", "#", "+", "+", "+", "+", "+" },
                             { "+", "+", "+", "+", "#", "+", "+", "+", "+", "+" },
               */
/* { "+", "+", "+", "+", "+", "+", "+", "+", "+", "+" },
                { "+", "+", "+", "+", "+", "+", "+", "+", "+", "+" },
                { "+", "+", "+", "#", "#", "+", "+", "+", "+", "+" },
                { "+", "+", "#", "#", "+", "+", "+", "+", "+", "+" },
                { "+", "+", "+", "+", "+", "#", "+", "+", "+", "+" },
                { "+", "+", "+", "+", "#", "+", "+", "+", "+", "+" },
                { "+", "+", "+", "+", "+", "+", "+", "+", "+", "+" }*//*

        };

        System.out.println("Original grid");
        for(int i = 0 ; i < R;i++)
        {
            for(int j = 0; j < C;j++)
            {
                if((grid[i][j].equals(output) ))
                    System.out.print("+");
                else if(!grid[i][j].equals(output))
                    System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
        nextGeneration(grid, R , C);
    }
    public static void nextGeneration(String[][] grid, int R , int C)
    {
        String star = "+";
        String hash = "#";
        char[][] future  = new char[R][C];

        for(int l = 1 ; l < R - 1;l++)
        {
            for (int k = 1; k < C - 1; k++)
            {
                String aliveNeighbours = "";
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                            aliveNeighbours += (grid[l + i][k + j]);
                            aliveNeighbours -= Integer.parseInt(grid[l][k]);

                if ((!grid[l][k].equals(star) && ((aliveNeighbours) < 2)))
                    future[l][k] =String.valueOf(0);

                 if ((!grid[l][k].equals(star) && ((aliveNeighbours) > 3)))
                    future[l][k] = String.valueOf(0);

                 if ((grid[l][k].equals(star) && ((aliveNeighbours) == 3)))
                    future[l][k] = String.valueOf(1);
                else
                    future[l][k] = String.valueOf(Integer.parseInt(grid[l][k]));
            }
        }

            System.out.println("Next Generation");
        String s = "+";
        String h = "#";
            for (int i = 0; i < R; i++)
            {
                for (int j = 0; j < C; j++)
                {
                    if (future[i][j].(s))
                        System.out.print("+");
                    else if(!future[i][j].(h))
                        System.out.print("#");
                }
                System.out.println();
            }
        }

    }

*/
