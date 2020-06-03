package ru.geekbrains.home_work_1_1_7;

/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например,
в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость
(когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. - done
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/


public class Main {

    public static void main(String[] args) {


        Plate plate = new Plate (50);

        plate.info();

        Cat catArray[] = new Cat[5];
        catArray[0] = new Cat( "Barsik", 15);
        catArray[1] = new Cat( "Musya", 20);
        catArray[2] = new Cat( "Boris", 17);
        catArray[3] = new Cat( "Tihon", 13);
        catArray[4] = new Cat( "Murka", 24);

        for (int i = 0; i < catArray.length; i++ ){
            catArray[i].eatFrom(plate);
            System.out.println("Satiety of " + catArray[i].getName()+ ": " + catArray[i].getSatiety());
            plate.info();
        }

        plate.addFood(50);
        plate.info();

    }
}
