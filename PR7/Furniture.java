public class Furniture{
    String material;
    double age;

    public Furniture(){}

    public Furniture(String material, double age){
        this.material = material;
        this.age = age;
    }

    public void print(){
        System.out.println("Furniture:");
        System.out.println("Материал: " + this.material + "\nВозраст: " + this.age + "\n");
    }


}