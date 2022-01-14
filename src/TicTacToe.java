import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        boolean flagToContinue = true, flagFirstPlayer = true, flagSecondPlayer = true;
        boolean flagWinFirstPlayer = false, flagWinSecondPlayer = false;
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        char space = '_';

        System.out.println("                Крестики нолики");
        System.out.println(" Игрок 1 играет крестиками (буквой Х (латинская)) ");
        System.out.println(" Игрок 2 играет крестиками (буквой O (латинская)) ");
        System.out.println("      Игроки печатают номера ячеек по очереди     ");
        System.out.println("        (первая цифра - номер по вериткали)       ");
        System.out.println("       (вторая цифра - номер по горизонтали)      ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0) {
                    System.out.print(space + " ");
                }
            }
            System.out.println();
        } // отпечатка пустого массива

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ход первого игока:");
                int inputI = scanner.nextInt();
                int inputJ = scanner.nextInt();
                if (array[inputI][inputJ] == 0) {
                    array[inputI][inputJ] = 1;
                    flagFirstPlayer = false;
                } else {
                    System.out.println(" Ячейка занята, выберите другую");
                    continue;
                }
            }                                     // ход первого игрока
            while (flagFirstPlayer);

            if ((array[0][0] == 1) && (array[1][1] == 1) && (array[2][2] == 1)) {
                flagWinFirstPlayer = true;
                break;
            } else if ((array[2][0] == 1) && (array[1][1] == 1) && (array[0][2] == 1)) {
                flagWinFirstPlayer = true;
                break;
            } else if ((array[0][0] == 1) && (array[0][1] == 1) && (array[0][2] == 1)) {
                flagWinFirstPlayer = true;
                break;
            } else if ((array[1][0] == 1) && (array[1][1] == 1) && (array[1][2] == 1)) {
                flagWinFirstPlayer = true;
                break;
            } else if ((array[2][0] == 1) && (array[2][1] == 1) && (array[2][2] == 1)) {
                flagWinFirstPlayer = true;
                break;
            } else if ((array[0][0] == 1) && (array[1][0] == 1) && (array[2][0] == 1)) {
                flagWinFirstPlayer = true;
                break;
            } else if ((array[0][1] == 1) && (array[1][1] == 1) && (array[2][1] == 1)) {
                flagWinFirstPlayer = true;
                break;
            } else if ((array[0][2] == 1) && (array[1][2] == 1) && (array[2][2] == 1)) {
                flagWinFirstPlayer = true;
                break;
            }// проверка условий победы
            flagToContinue = false;
            for (i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] == 0) {
                        flagToContinue = true;
                    }
                }
            }  // проверка пустых полей

            if (flagToContinue == false) {
                break;
            } //прерывание по из-за отсутствия клеток

            for ( i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] == 0) {
                        System.out.print(space + " ");
                    } else if (array[i][j] == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            } // отпечатка массива

            do {
                System.out.println("Ход второго игока:");
                int inputI = scanner.nextInt();
                int inputJ = scanner.nextInt();
                if (array[inputI][inputJ] == 0) {
                    array[inputI][inputJ] = 2;
                    flagSecondPlayer = false;
                } else {
                    System.out.println(" Ячейка занята, выберите другую");
                    continue;
                }
            }
            while (flagSecondPlayer);   // ход второго игрока

            if ((array[0][0] == 2) && (array[1][1] == 2) && (array[2][2] == 2)) {
                flagWinSecondPlayer = true;
                break;
            } else if ((array[2][0] == 2) && (array[1][1] == 2) && (array[0][2] == 2)) {
                flagWinSecondPlayer = true;
                break;
            } else if ((array[0][0] == 2) && (array[0][1] == 2) && (array[0][2] == 2)) {
                flagWinSecondPlayer = true;
                break;
            } else if ((array[1][0] == 2) && (array[1][1] == 2) && (array[1][2] == 2)) {
                flagWinSecondPlayer = true;
                break;
            } else if ((array[2][0] == 2) && (array[2][1] == 2) && (array[2][2] == 2)) {
                flagWinSecondPlayer = true;
                break;
            } else if ((array[0][0] == 2) && (array[1][0] == 2) && (array[2][0] == 2)) {
                flagWinSecondPlayer = true;
                break;
            } else if ((array[0][1] == 2) && (array[1][1] == 2) && (array[2][1] == 2)) {
                flagWinSecondPlayer = true;
                break;
            } else if ((array[0][2] == 2) && (array[1][2] == 2) && (array[2][2] == 2)) {
                flagWinSecondPlayer = true;
                break;
            }// проверка условий победы

            flagToContinue = false;
            for (i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] == 0) {
                        flagToContinue = true;
                    }
                }
            }  // проверка пустых полей

            if (flagToContinue == false) {
                break;
            } //прерывание по из-за отсутствия клеток

            for ( i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] == 0) {
                        System.out.print(space + " ");
                    } else if (array[i][j] == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }  // отпечатка массива
        }
        if (flagWinFirstPlayer) {
            System.out.println("Победил первый игрок");
        } else if (flagWinSecondPlayer) {
            System.out.println("Победил второй игрок");
        } else if ( flagWinFirstPlayer == false || flagWinSecondPlayer == false ) {
            System.out.println("Ничья");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0) {
                    System.out.print(space + " ");
                } else if (array[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        } // отпечатка массива
    }
}




