package hospital;

/*
    Task 2.
 Создать программу для имитации работы клиники.
 Пусть в клинике будет три врача: хирург, терапевт и дантист.
 Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
 Так же предусмотреть класс «Пациент» и класс «План лечения».
 Создать объект класса «Пациент» и добавить пациенту план лечения.
 Так же создать метод, который будет назначать врача пациенту согласно
 плану лечения.
 Если план лечения имеет код 1 – назначить хирурга и выполнить метод
 лечить.
 Если план лечения имеет код 2 – назначить дантиста и выполнить метод
 лечить.
 Если план лечения имеет любой другой код – назначить терапевта и
 выполнить метод лечить.
 */

public abstract class Doctor {
    public void heal(Patient patient) {

    }
}
