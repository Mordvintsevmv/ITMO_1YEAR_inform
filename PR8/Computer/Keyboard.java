package Computer;

public class Keyboard implements IODevice {

    double price;
    String model;

    public Keyboard(double price, String model){
        this.price = price;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Клавиатура " + this.model + " стоит " + this.price);
    }

    @Override
    public void sendData(String data) {
        System.out.println("Данные получены");
    }
}