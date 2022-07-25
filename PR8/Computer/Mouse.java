package Computer;

public class Mouse implements IODevice {

    double price;
    String model;

    public Mouse(double price, String model){
        this.price = price;
        this.model = model;
    }

    public void print() {
        System.out.println("Мышь " + this.model + " стоит " + this.price);
    }

    public void sendData(String data) {
        System.out.println("Данные получены");
    }
}