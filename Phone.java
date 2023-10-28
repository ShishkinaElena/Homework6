package dzPhone;

public class Phone {
    /*Создайте класс Phone, который содержит переменные number, model и weight.
    Создайте три экземпляра этого класса.
    Выведите на консоль значения их переменных.
    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
    Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
    Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    Добавить конструктор без параметров.*/
    private String number; // модификатор доступа
    private String model;
    private double weight;


    public Phone(){
        System.out.println("Phone is created");
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = String.valueOf(number);
        this.model = model;
        this.weight = weight;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public  void receiveCall(String name){
        System.out.printf("Call %s\n", name);
    }
    public void displeyInfo() {

        System.out.printf("Number: %s \tModel: %s  Weight: %.2f\n", number, model, weight);
   }

}

