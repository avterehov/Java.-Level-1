package ru.geekbrains.home_work_1_1_7;

public class Plate {
    private int food;
    public Plate (int food){
        this.food = food;
    }
    public void info(){
        System.out.println("plate: "+ food);
    }
    public void setFood( int food){
        this.food = food;
    }
    public int getFood(){
        return food;
    }
    public void decreaseFood (int n){
        food -= n;
    }
    public void addFood (int n){
        food +=n;
    }
}
