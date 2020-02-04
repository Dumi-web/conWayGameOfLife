import static jdk.nashorn.internal.objects.Global.print;

public class dish {
    public static void main(String[] args) {
        int rows = 3, cols = 10;
        String outcome = "#";
        String[][] dish = {{"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "#", "#", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "#", "+", "+", "+", "+", "+"},
        };
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!dish[i][j].equals(outcome))
                    System.out.print("+ ");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
        nextGeneration(dish);

    }

    static void nextGeneration(String[][]grid) {
        String [][] dish = new String[arrayList.size()][];
        for(int i = 0; i<arrayList.size();i++){

        }
    }


}







