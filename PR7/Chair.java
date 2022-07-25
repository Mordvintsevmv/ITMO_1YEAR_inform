public class Chair extends Furniture{
    private String color;

    public Chair(String material, double age, String color){
        super(material,age);
        this.color = color;
    }

    @Override
    public void print(){
        System.out.println("из Furniture: ");
        super.print();
        System.out.println("Стул:");
        System.out.println("Материал: " + this.material + "\nВозраст: " + this.age + "\nЦвет: " + this.color + "\n");
    }

    @Override
    public String toString(){
        return ("material: " + this.material + "\nage: " + this.age + "\ncolor: " + this.color + "\n");

    }
}