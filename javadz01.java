// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class javadz01 {

//  Вариант 1.

    private static void invertArrayVar1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }
}


// 2. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1], пройти по нему циклом и числа меньшие 6 умножить на 2;
public class jvadz01 {
    

private static void changeArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) {
            arr[i] *= 2;
        }
    }
}

/*
3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами;
*/

//  Вариант 1.

private static void fillDiagonal1(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0, z = arr.length - 1; j < arr.length; j++, z--) {
            if (i == j || i == z) {
                arr[i][j] = 1;
            } else {
                arr[i][j] = 0;
            }
        }
    }
}

//  Вариант 2.

private static void fillDiagonal2(int[][] arr) {
    int str, bkw;
    for (str = 0, bkw = arr.length - 1; str < arr.length; str++, bkw--) {
        arr[str][bkw] = 1;
        arr[str][str] = 1;
    }
}

//  Вариант 3.

private static void fillDiagonal3(int[][] arr, int z) {
    for (int i = 0; i < arr.length; i++) {
        arr[i][i] = 1;
        arr[i][z - i - 1] = 1;
    }
}

private static void printDiagonal(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j] + "  ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }
    System.out.println();
}

/*
4**. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
*/

private static int findMax(int[] arr) {
    int max = arr[0];

    for (int i : arr) {
        if (i > max) {
            max = i;
        }
    }
    return max;
}

private static int findMin(int[] arr) {
    int min = arr[0];

    for (int i : arr) {
        if (i < min) {
            min = i;
        }
    }
    return min;
}
