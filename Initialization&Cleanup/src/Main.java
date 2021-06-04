import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 4
        /*
        3. (1) Создайте класс с конструктором по умолчанию (без параметров), который вы-
        водит на экран сообщение. Создайте объект этого класса.
        4. Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий
        в качестве параметра строку (String) и распечатывающий ее вместе с сообщением.
        */

        Task4 task4 = new Task4("hello task 4 \n");

        // Task 5 - 6
        /*
        5. Создайте класс Dog (собака) с перегруженным методом bark() (лай). Методдолжен
        быть перегружен для разных примитивных типов данных с целью вывода сообще-
        ния о лае, завывании, поскуливании и т. п. в зависимости от версии перегруженного
        метода. Напишите метод main(), вызывающий все версии.

        6. Измените предыдущее упражнение так, чтобы два перегруженных метода прини-
        мали два аргумента (разных типов) и отличались только порядком их следования
        в списке аргументов. Проверьте, работает ли это
        */
        Dog spot = new Dog();
        spot.bark(1);
        spot.bark('a');
        spot.bark(2.0);
        spot.bark(999, "fuffufu");
        spot.bark("wowowow", 1234);
        System.out.println('\n');


        // Task 7
        /*
        Создайте класс без конструктора. Создайте объект этого класса в методе main(),
        чтобы удостовериться, что конструктор по умолчанию синтезируется автоматически.
        */

        Task7 task7 = new Task7();

        // Task 12
        /*
        Включите в класс с именем Tank (емкость), который можно наполнить и опустошить.
        Условие «готовности» требует, чтобы он был пуст перед очисткой. Напишите метод
        finalize(), проверяющий это условие. В методе main() протестируйте возможные
        случаи использования вашего класса.
        */

        Tank tank = new Tank();

        tank.setCapacity(25);
        System.out.println("Tank capacity = " + tank.getCapacity());
        tank.finalize();
        tank.setCapacity(0);
        System.out.println("Tank capacity = " + tank.getCapacity());
        tank.finalize();


        // Task 14
        /*
         Создайте класс с полем static String, инициализируемым в точке определения,
         и другим полем, инициализируемым в блоке static. Добавьте статический метод,
         который выводит значения полей и демонстрирует, что оба поля инициализируются
         перед использованием.
        */

        System.out.println('\n' + "Initialized at the point of definition: " + " " + Task14.str1 + " Static block: " + Task14.str2);

        // Task 19
        /*
         Напишите метод, получающий список аргументов переменной длины с массивом
        String. Убедитесь в том, что этому методу может передаваться как список объектов
        String, разделенных запятыми, так и String[].
         */

        String[] arr = {"firstAr", "secondAr", "thirdAr"};
        System.out.println("Array in params: ");
        Task19.task19(arr);
        System.out.println("List in params: ");
        Task19.task19("firstL", "secondL", "thirdL");
        System.out.println();

        // Task 22
        /*
        Напишите команду switch для перечисления из предыдущего примера. Для
        каждого случая выведите расширенное описание конкретной валюты.
         */

        describe(Task22.AUD);
        describe(Task22.CAD);
        describe(Task22.EUR);
        describe(Task22.GBP);
        describe(Task22.JPY);
        describe(Task22.USD);



    }

    public static void describe (Task22 task22){
        switch (task22) {
            case AUD:
                System.out.println( Task22.AUD +  " - Australian dollar");
                break;
            case CAD:
                System.out.println(Task22.CAD + " - Canadian dollar");
                break;
            case EUR:
                System.out.println(Task22.EUR + " - Euro");
                break;
            case JPY:
                System.out.println(Task22.JPY + " - Japanese yen");
                break;
            case USD:
                System.out.println(Task22.USD + " - US dollar");
                break;
            case GBP:
                System.out.println(Task22.GBP + " - Pound sterling");
                break;
            default:
                System.out.println("invalid value");
                break;
        }

    }
}

