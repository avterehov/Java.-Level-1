package ru.geekbrains.home_work_1_1_2;

public class Main {

    public static void main(String[] args) {

        // Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Задание 1.");

        // выводим исходный массив
        System.out.println("Исходный массив:");
        printMassive(a);

        // преобразуем массив
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        // вывод нового, преобразованного массива
        System.out.println("Преобразованный массив:");
        printMassive(a);

        // Задание 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] b = new int [8];
        System.out.println();
        System.out.println("Задание 2.");
        System.out.println("Заданный массив");
        for (int i = 0; i < b.length; ++i){
            b[i]=i*3;
        }
        printMassive(b);
        // Задание 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println();
        System.out.println("Задание 3.");
        System.out.println("Исходный массив:");
        printMassive(c);

        for ( int i = 0 ; i < c.length ; i++){
            if (c[i] < 6) {
                c[i] *=2;
            }
        }

        System.out.println("Преобразованный массив:");
        printMassive(c);

        //Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int Size = 10;
        int[][] table4 = new int[Size][Size];

        for ( int i = 0; i < Size; i++){
          table4[i][i] = 1;
        }
        System.out.println();
        System.out.println("Задание 4:");
        System.out.print("Получившийся массив:");
        System.out.println();
        printMassive2d(table4);

        //Задание 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] d = { 33, 24, -88, 34, -17, 5, 13, 66};
        int mind = d[0];
        int maxd = d[0];
        for (int i = 0; i < d.length; i++){
            if (d[i] < mind){
                mind = d[i];
            }
            if (d[i] >  maxd){
                maxd = d[i];
            }
        }
        System.out.println();
        System.out.println("Задание 5.");
        System.out.println("Исходный массив:");
        printMassive(d);
        System.out.println("Минимальное значение в массиве: " + mind);
        System.out.println("Максимальное значение в массиве: " + maxd);

        // Задание 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
        // массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
        // эти символы в массив не входят.

        int [] e = {1, 1, 1, 1, 1,5 };
        System.out.println();
        System.out.println("Задание 6: ");
        System.out.println("Исходный массив: ");
        printMassive(e);
        System.out.println();
        boolean twoParts;
        twoParts = twoEqualParts(e);
        System.out.println ("В массиве есть место, в котором сумма левой и правой части массива равны:" + twoParts );
    }

    static void printMassive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }

    static void printMassive2d(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
          }
    }

    static boolean twoEqualParts(int[] a) {

        boolean result = false;

        for (int i = 0; i < a.length; i++) {

            //вычисляем первую часть массива
            int part1 = 0;
            for (int j = 0; j <= i; j++) {
                part1 = part1 + a[j];
            }

            //  вычисляем вторую часть массива
            int part2 = 0;
            for (int q = i + 1; q < a.length; q++) {
                part2 = part2 + a[q];
            }

            if (part1 == part2) {
                result = true;
            }
        }
        return result;
    }

}




