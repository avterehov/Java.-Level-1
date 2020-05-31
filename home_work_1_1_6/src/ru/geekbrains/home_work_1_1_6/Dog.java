package ru.geekbrains.home_work_1_1_6;

public class Dog extends Animal{

    public static int dogNumber = 0;

    Dog (String name) {
        super(name);
        this.runLength = 500;
        this.swimLength = 10;
        dogNumber ++;
    }
    public static int howManyDogs(){
        return dogNumber;
    }
}
