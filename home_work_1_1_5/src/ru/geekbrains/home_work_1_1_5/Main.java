package ru.geekbrains.home_work_1_1_5;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
// 4. Создать массив из 5 сотрудников.
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Main {

    public static void main(String[] args) {

      Employee[] empArray = new Employee[5];
      empArray[0] = new Employee("Ivanov I.I","manager"," ivanov@mail.ru", "+7 952 999 99 99", 10000, 24);
      empArray[1] = new Employee("Petrov P.P.", "director", "petrov@mail.ru", "+7 952 888 88 88", 20000, 54);
      empArray[2] = new Employee("Sidorov S.S.", "engineer", "sidorov@mail.ru", "+7 952 777 77 77", 15000, 44);
      empArray[3] = new Employee("Kuznetsov K.K.", "barmen", "kuznetsov@mail.ru", "+ 7 952 666 66 66", 5000, 18 );
      empArray[4] =  new Employee("Utkin D.D.", "cook", "utkin@mail.ru", "+ 7 952 555 55 55", 20000, 36);

    for ( int i = 0;  i < empArray.length; i ++){
        if (empArray[i].age > 40){
            empArray[i].printData();
            System.out.println();
   }
    }

    }
}


