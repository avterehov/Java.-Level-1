package ru.geekbrains.home_work_1_1_6;

public class Animal {

    public static int animalsNumber = 0;

    protected String name;
    protected int runLength;
    protected int swimLength;

    Animal(String name) {
        this.name = name;
        animalsNumber ++;

    }

    public void run(int a) {
        if (a > runLength) {
            System.out.println(name + " can not  run  " + a + " meters. Maximum " + runLength+ "meters.");
        } else {
            System.out.println(name + " ran " + a + " meters.");
        }

    }

    void swim (int a) {
        if  (a > swimLength) {
            System.out.println(name + " can not  swim  " + a + " meters. Maximum -  " + swimLength + " meters.");
        } else {
            System.out.println(name + " swam " + a + " meters");
        }
    }

    public static int howManyAnimals(){
        return animalsNumber;
    }
}
