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
            for (int j = 0; j < array[i].length - 1;j++) {   // не могу перебрать столбик
                if (array.length == array[j].length) { //не хочет работать со столбиком, работает только с первой строчкой массива
                    System.out.println("Матриця квадратна");
                    return 1;
                } else {
                    System.out.println("Матриця не квадратна");
                    return 2;
                }
            }
        }return 0;
    }
}










/*
    public static int arraySquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; ) {
                if (array.length == array[j].length) {
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
