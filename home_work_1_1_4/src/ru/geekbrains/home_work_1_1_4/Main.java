package ru.geekbrains.home_work_1_1_4;

import com.sun.source.util.DocTreeScanner;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_0 = '0';

    static final int DOT_TO_WIN = 4;
    static int SIZE = 5;
    static char [][] map;
    private static char symbol;


    public static void main(String[] args) {

        do {

            System.out.println("Игра крестики-нолики");
            System.out.println("Побеждает тот кто выстроит 1 ряд из " + DOT_TO_WIN + " своих фишек (по горизонтали/вертикали/диагонали.");

            initMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Поздравляем вы выиграли!");
                    break;
                } else if (isMapFull()) {
                    System.out.println("Ничья!");
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_0)) {
                    System.out.println("Вы проиграли!");
                    break;
                } else if (isMapFull()) {
                    System.out.println("Ничья!");
                }


            }

        }while (menuContinue());

    }

    static void initMap(){
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i ++ ){
           for (int j = 0; j < SIZE; j++)
               map [i][j] = DOT_EMPTY;
        }

    }

    static void printMap() {

        for (int i  = 0; i <= SIZE; i ++){
            System.out.print(i + " ");
                    }
        System.out.println();


        for (int i = 0; i < SIZE; i ++){
            System.out.print((i +1) + " ");

            for (int j = 0; j < SIZE; j ++){
                System.out.print(map [i][j]+ " ");
            }
            System.out.println();
        }

    }

    static void humanTurn(){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты  незанятого поля в формате X и Y:");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
            }
        while (!isCellValid (x, y));
        map[y][x] = DOT_X;

        }

        static void aiTurn(){

            int x;
            int y;

            Random random = new Random();

            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
                System.out.println("ход по рандому");
            }
            while (!isCellValid(x, y));

            map [y][x] = DOT_0;
        }



        static boolean checkWin( char symbol) {

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {

                    if (i <= SIZE - DOT_TO_WIN) {
                        for (int g = 0; g < DOT_TO_WIN; g++) {
                            if (map[i + g][j] != symbol) {
                                break;
                            } else if(g == DOT_TO_WIN -1 && map[i + g][j] == symbol) {

                             return true;
                            }
                        }
                    }
                    if (j <= SIZE - DOT_TO_WIN) {
                        for (int g = 0; g < DOT_TO_WIN; g++) {
                            if (map[i][j + g] != symbol) {
                                break;
                            } else if (g == DOT_TO_WIN -1 && map[i][j + g] == symbol){
                                return true;
                            }
                        }
                    }

                    if (i <= SIZE - DOT_TO_WIN && j <= SIZE - DOT_TO_WIN) {

                        for (int g = 0; g < DOT_TO_WIN; g++) {
                            if (map[i + g][j + g] != symbol) {
                              break;
                            }
                            else if (g == DOT_TO_WIN -1 && map[i + g][j + g] == symbol){
                                return true;

                            }
                        }

                        for (int g = 0; g < DOT_TO_WIN; g++) {
                                if (map[i + g][j + DOT_TO_WIN-1-g] != symbol) {
                                    break;
                                }
                                else if (g == DOT_TO_WIN-1 && map[i + g][j + DOT_TO_WIN- 1-g] == symbol){
                                    return true;
                                }
                        }


                        }

                    }
                }
            return false;
            }



    static boolean isCellValid(  int x,int y){

        if (x < 0 || x>= SIZE || y < 0 || y >=SIZE){
            return false;
        }
        if (map[y][x] == DOT_EMPTY){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isMapFull (){
        for (int i =0; i < SIZE; i ++){
            for (int j = 0; j < SIZE; i ++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;

                }
            }

        }
        return true;

    }

    static boolean menuContinue() {
        Scanner sc = new Scanner(System.in);
        int yourChoice;
        do {
            System.out.println("Игра окончена!");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            yourChoice = sc.nextInt();
        } while (yourChoice < 0 || yourChoice > 1);
        if (yourChoice == 1){
            return true;

        }
        return false;
    }

    }





