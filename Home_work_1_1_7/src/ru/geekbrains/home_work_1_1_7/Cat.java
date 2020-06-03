package ru.geekbrains.home_work_1_1_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAppetite (int appetite){
        this.appetite = appetite;

    }
    public int getAppetite (){
        return appetite;
    }

    public void eatFrom (Plate p){
        if (appetite <= p.getFood()){
            p.decreaseFood(appetite);
            this.satiety = true;
        }
    }
    public void setSatiety (boolean satiety){
        this.satiety = satiety;
    }

    public boolean getSatiety (){
        return satiety;
    }

}
