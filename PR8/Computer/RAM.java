package Computer;

public class RAM implements Memory {

    double size;
    String data = "Что-то такое";

    public RAM(double size){
        this.size = size;
    };

    @Override
    public boolean writeData(String data) {
        this.data += data;
        return true;
    }

    @Override
    public void print() {
        System.out.println("На оперативке с памятью " + this.size + " записана информация: " + this.data);
    }

    @Override
    public String getData() {
        return data;
    }
}