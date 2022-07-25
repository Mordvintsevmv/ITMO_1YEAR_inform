package Computer;

public class Screen implements IODevice {

    double price;
    String model;

    public Screen(double price, String model){
        this.price = price;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Монитор " + this.model + " стоит " + this.price);
    }

    @Override
    public void sendData(String data) {
        System.out.println("Данные получены");
    }
}