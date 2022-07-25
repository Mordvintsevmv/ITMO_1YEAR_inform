package Computer;

public class Bus implements ProcessingUnit {

    boolean exist;
    String info;

    public Bus(boolean exist, String info){
        this.exist = exist;
        this.info = info;
    }

    public void print(){
        if (this.exist == true){
        System.out.println("Стоит шина: " + this.info);}
    }

    public void isExist(){
        if (this.exist == true){
            System.out.println("Шина стоит!");}
    }
}