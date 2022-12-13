public class MainArray {
    // psvm не делал так как по условиям дз не требуется, если надо добавлю
    public static double averageArray(double[] array) {
        double sum = 0.0;
        double average = 0.0;
        for (double arrayElement : array) {
            sum = sum + arrayElement;
            average = sum / (array.length);
        }
        return average;
    }


    public static int arraySquare(int[][] array) {
        if (array.length == array[0].length && array.length >= 2) {
            System.out.println("Матриця квадратна");
            return 1;
        }
        System.out.println("Матриця не квадратна");
        return 2;
    }
}