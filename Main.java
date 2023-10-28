package dzPhone;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.setModel("Samsung S55");
        phone.setNumber("999-999-999");
        phone.setWeight(100.123);

        Phone phone1 = new Phone("888-888-888", "Xiaomi", 192.6);
        Phone phone2 = new Phone("777-777-777", "Apple", 200);
        phone.displeyInfo();
        phone1.displeyInfo();
        phone2.displeyInfo();

        phone.receiveCall("Misha");
        System.out.println(phone.getNumber());

    }
}
