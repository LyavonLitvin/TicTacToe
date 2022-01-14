import java.util.Random;

public class DoubleArrayHomeTasks {
    public static void main(String[] args) {
        int iFinal = 3, jFinal = 3;
        int[][] array = new int[iFinal][jFinal];
        Random random = new Random();

        for (int i = 0; i < iFinal; i++) {
            for (int j = 0; j < jFinal; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < iFinal; i++) {
            for (int j = 0; j < jFinal; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sumOfChElement = 0;
        for (int i = 0; i < iFinal; i++) {
            if (array[i][i] % 2 == 0) {
                sumOfChElement += array[i][i];
            }
        }
        System.out.println("Сумма четных элементов главной диагонали = " + sumOfChElement); // конец первой задачи;

        System.out.println("Нечетные элементы под главной диагональю включительно: ");
        for (int i = 0; i < iFinal; i++) {
            for (int j = 0; j < jFinal; j++) {
                if (array[i][j] % 2 != 0 && i >= j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println(); // конец второй задачи;

        int proizvElement1 = 1, proizvElement2 = 1;
        for (int i = 0; i < iFinal; i++) {
                proizvElement1 *= array[i][i];
        }
        for (int i = 0; i <iFinal ; i++) {
            proizvElement2 *= array[i][iFinal-i-1];
        }
        if (proizvElement1 > proizvElement2) {
            System.out.println("Произведение элементов главной диагонали больше");
            }
            else if (proizvElement1 == proizvElement2) {
                System.out.println("Произведение элементов диагоналей равны");
            }
            else {
                System.out.println("Произведение элементов побочной диагонали больше");
            }                                                                             // конец третьей задачи;
        int sumOfChElement2 = 0;
        for (int i = 0; i < iFinal-2; i++) {
            for (int j = 0; j < jFinal-i-1; j++) {
                if ( array[i][j] % 2 == 0 ) {
                    sumOfChElement2 += array[i][j];
                }
            }
        }
        System.out.println("Cумма четных эементов над побочной диагональю = " + sumOfChElement2); // конец четвертой задачи;

        int[][] arrayCopy = new int[iFinal][jFinal];
        for (int i = 0; i < iFinal; i++) {
            for (int j = 0; j < jFinal; j++) {
                arrayCopy[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < iFinal; i++) {
            for (int j = 0; j < jFinal; j++) {
                array[j][i] = arrayCopy[i][j];
            }
        }
        for (int i = 0; i < iFinal; i++) {
            for (int j = 0; j < jFinal; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }                                                    // конец пятой задачи;

}
