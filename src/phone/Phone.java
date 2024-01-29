package phone;

/*
Класс phone.Phone.
Создайте класс phone.Phone, который содержит переменные number, model и
weight.+
Создайте три экземпляра этого класса.+
Выведите на консоль значения их переменных. -
Добавить в класс phone.Phone методы: receiveCall, имеет один параметр – имя
звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
возвращает номер телефона. Вызвать эти методы для каждого из
объектов.+
Добавить конструктор в класс phone.Phone, который принимает на вход три
параметра для инициализации переменных класса - number, model и
weight.+
Добавить конструктор, который принимает на вход два параметра для
инициализации переменных класса - number, model. +
Добавить конструктор без параметров.+
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два
параметра - имя звонящего и номер телефона звонящего. Вызвать этот
метод.
Создать метод sendMessage с аргументами переменной длины. Данный
метод принимает на вход номера телефонов, которым будет отправлено
сообщение. Метод выводит на консоль номера этих телефонов.
 */

import java.util.Arrays;

public class Phone {
    public int number;
    public String model;
    public int weight;
    public  Phone(int number, String model, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public  Phone(int number, String model) {
        this(number, model, 0 );
    }
    public  Phone() {
        this(0,"anime");
    }
    public  void receiveCall(String nameOfIncomingCall) {
    System.out.println("Звонит: " + nameOfIncomingCall);
}

    @Override
    public String toString() {
        return "phone.Phone{" +
                "number = " + number +
                ", model = '" + model + '\'' +
                ", weight = " + weight +
                '}';
    }
    public  void getNumber() {
        System.out.println("Звонит: " + number);
    }

    public void receiveCall(String nameOfIncomingCall, int number) {
        System.out.printf("Звонит %s\nНомер абонемента: %S\n", nameOfIncomingCall, number);
    }
    public void sendMessage(int... numbers) {
        System.out.println("Сообщение отправлено на номера:");
        System.out.println(Arrays.toString(numbers));
    }
}
