package ru.geekbrains.home_work_1_1_3;

/*
1. Написать программу, которая загадывает случайное число от 0 до 9,
и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
 больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша
 выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        guessTheNumber();
        guessTheWord();

	    }

	    /*
1. Написать программу, которая загадывает случайное число от 0 до 9,
и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
 больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша
 выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/

	    static void guessTheNumber ( ){

            int a = 10;
            Random rand = new Random();
            int guessedNumber = rand.nextInt(a+1);

            System.out.println("Игра 'Угадай число:'");
            System.out.println("Загадано число от 0 до " + a);
            System.out.println("Попробуйте угадать это число. У вас три попытки");
            System.out.println();

            Scanner sc = new Scanner(System.in);

            for (int i = 1; i <= 3; i ++){
                System.out.println("Попытка №" + i);
                System.out.println("Введите число: ");

            int yourVariant = sc.nextInt();

            if (yourVariant == guessedNumber){
                System.out.println("Поздравляем! Вы угадали число.");
                break;
            }
            else if ( guessedNumber < yourVariant){
                System.out.println("Не угадали! Загаданное число меньше, чем введенное вами число.");
            }
            else {
                System.out.println("Не угадали! Загаданное число больше, чем введенное вами число.");
            }


            }
            menuContinue();
        }

    static void menuContinue() {
        Scanner sc = new Scanner(System.in);
        int yourChoice;
        do {
            System.out.println("Игра окончена!");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            yourChoice = sc.nextInt();
        } while (yourChoice < 0 || yourChoice > 1);
        switch (yourChoice) {
            case 0:
                System.out.println("Всего хорошего. Спасибо за игру!");
                System.out.println();
                break;
            case 1:
                System.out.println("Отлично! Сыграем снова!");
                System.out.println();
                guessTheNumber();
                break;
        }

    }

/*  2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
    "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
    "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы
*/

    static void guessTheWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        //  загадываем число
        int arrayLengh = words.length;
        Random rand = new Random();
        int guessedName = rand.nextInt(arrayLengh);
        String guessedWord = words[guessedName];


        System.out.println("Игра 'Угадай число:'");
        System.out.println("Загадано слово из списка:");

        //печатаем массив
        for (int i = 0; i < arrayLengh; i++) {
            System.out.print(words[i] + "\t" + "\t");
            if ((1 + i) % 5 == 0) {
                System.out.println();
            }

        }

        System.out.println("Попробуйте угадать загаданное слово");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        char[] fog = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#',};

        // начинаем играть уровень
        while (true) {

            String yourWord = sc.nextLine();

            if (guessedWord.equals(yourWord)) {
                System.out.println("Поздравляем! Вы угадали загаданное слово!");
                break;

            } else {
                System.out.println("Не угадали, попробуйте еще раз!");
                System.out.println("Угаданные буквы:");

                // присваиваем и печатаем совпавшие буквы

                int lengthWord = guessedWord.length();
                int lengthYourWord = yourWord.length();
                int minWordLength;
                if (lengthWord <= lengthYourWord) {
                    minWordLength = lengthWord;
                }
                else {
                    minWordLength = lengthYourWord;
                }


                    for (int j = 0; j < minWordLength; j++) {
                        char wordSymbol = guessedWord.charAt(j);
                        char yourWordSymbol = yourWord.charAt(j);

                        if (fog[j] == '#' && wordSymbol == yourWordSymbol) {
                            fog[j] = wordSymbol;
                        }
                    }

                    for (int i = 0; i < fog.length; i++) {
                        System.out.print(fog[i]);

                    }
                    System.out.println();

                }

            }
        sc.close();
        }
    }







