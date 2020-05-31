package ru.geekbrains.home_work_1_1_6;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150);
        -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия
        (бег: кот 200 м., собака 500 м.;
         плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Kesha");
        Cat cat2 = new Cat( "Murzik");
        Cat cat3 = new Cat("Dusya");
        Dog dog1 = new Dog("Sharik");


       cat1.run(2000);
       cat1.swim(10);
       cat3.run(120);
       dog1.run(300);
       dog1.swim(5);

     System.out.println("Cats created: " + Cat.howManyCats());
     System.out.println("Dogs created: " + Dog.howManyDogs());
     System.out.println("Animals created: " + Animal.howManyAnimals());

    }

}
