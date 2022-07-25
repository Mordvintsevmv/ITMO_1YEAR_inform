package Computer;

public class SSD implements Memory {

    double size;
    String data = "Что-то записано";

    public SSD(double size){
        this.size = size;
    }

    @Override
    public boolean writeData(String data) {
        this.data += data;
        return true;
    }

    @Override
    public void print() {
        System.out.println("На диске с памятью " + this.size + " записана информация: " + this.data);
    }

    @Override
    public String getData() {
        return data;
    }
}