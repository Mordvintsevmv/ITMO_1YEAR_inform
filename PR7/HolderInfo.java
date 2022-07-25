public class HolderInfo{
    private static String name = "Миллиардер Миллионеров";
    private int ID;
    private int age;
    private String charac;

    public HolderInfo(int ID, int age, String charac){
        this.ID = ID;
        this.age = age;
        this.charac = charac;
    }

    public HolderInfo(String name, int ID, int age, String charac){
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.charac = charac;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int ID){
        this.ID = ID;
    }

    public int getID(){
        return this.ID;
    }

    public void setAge(int Age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setCharac(String charac){
        this.charac = charac;
    }

    public String getCharac(){
        return this.charac;
    }

    public void print(){
        System.out.println("Имя владельца: " + this.name + "\nID: " + this.ID + "\nВозраст: " + this.age + "\nХарактеристика: " + this.charac + "\n");
    }
}