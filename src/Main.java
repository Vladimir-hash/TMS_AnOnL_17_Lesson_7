import phone.Phone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone(111_11_11, "Samsung", 300);
        Phone phone2 = new Phone(222_22_22, "Apple", 200);
        Phone phone3 = new Phone(333_33_33, "Nokia", 350);
        Phone phone4 = new Phone(444_44_44, "Asus");
        Phone phone5 = new Phone();

        System.out.println(phone);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);
        System.out.println(phone5);

        phone.receiveCall("Tom");
        phone2.receiveCall("Andrey");
        phone3.receiveCall("Inna");
        phone.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone.receiveCall("Andy", 777_77_77);
        phone.sendMessage(111_11_11, 222_22_22, 333_33_33);
    }
}