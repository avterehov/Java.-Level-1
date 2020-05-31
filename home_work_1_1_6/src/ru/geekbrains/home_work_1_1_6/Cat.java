package ru.geekbrains.home_work_1_1_6;

public class Cat extends Animal {

    public static int catNumber = 0;

public Cat (String name){
    super(name);
    this.runLength = 200;
    this.swimLength = 0;
    catNumber ++;
    }

 void swim(int a){
        System.out.println(name + " can not  swim");
    }

    public static int howManyCats(){
    return catNumber;
    }











}
