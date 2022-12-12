public class MainArray {
    public static void main(String[] args) {

    }

    public static double averageArray(int[][] array) {
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
            average = sum / (array.length * array.length);
        }
        return average;
    }

    public static int arraySquare(int[][] array) {

        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {

               if (array.length == array[0].length )
               {
                    System.out.println("Матриця квадратна");
                    return 1;
                }
            }
        }
        System.out.println("Матриця не квадратна");
        return 2;
    }
}

