package Computer;

public class CPU implements ProcessingUnit {

    boolean exist;
    String info;
    double frequency;

    public CPU(boolean exist, String info, double frequency){
        this.exist = exist;
        this.info = info;
        this.frequency = frequency;
    }

    @Override
    public void print(){
        if (this.exist == true){
            System.out.println("Стоит процессор " + this.info + " с частотой " + this.frequency);}
    }

    @Override
    public void isExist(){
        if (this.exist == true){
            System.out.println("Процессор стоит!");}
    }
}