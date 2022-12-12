public class MainArray {
    public static void main(String[] args) {

    }

    public static double countArray(int[][] array) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                sum += array[i][k];

            }
            average = sum / (array.length * array.length);
        }

        return average;

    }

    public static int arraySquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length-1; k++ ) {
                if (array.length == array[k].length) {
                    System.out.println("Матрица квадратная");
                    return 1;
                } else
                    System.out.println("Матрица не квадратная");
                return 2;
            }
        }

        return 0;
    }
}
  /*   public static int arraySquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length == array[j].length) {
                    System.out.println("Матрица квадратная");
                    return 1;
                } else {
                    System.out.println("Матрица не квадратная");
                    return 2;
                }
            }
        }
        return 0;
    }*/

  /*  public static int arraySquare(int[][] array) {
        for (int[] ints : array) {
            if (array.length == ints.length) {
                System.out.println("Матрица квадратная");
                return 1;
            } else
                System.out.println("Матрица не квадратная");
            return 2;
        }

        return 0;
    }}*/




