public class Plant{
    private String type;
    private String color;
    private String existenceArea;
    private boolean rare;

    public Plant(){}

    public Plant(String type){
        this.type = type;
    }

    public Plant(String type, String color){
        this.type = type;
        this.color = color;
    }

    public Plant(String type, String color, String existenceArea){
        this.type = type;
        this.color = color;
        this.existenceArea = existenceArea;
    }

    public Plant(String type, String color, String existenceArea, boolean rare){
        this.type = type;
        this.color = color;
        this.existenceArea = existenceArea;
        this.rare = rare;
    }

    public void print(){
        System.out.println("Тип: " + this.type + "\nЦвет: " + this.color + "\nОбласть обитания: " + this.existenceArea + "\nРедкое: " + this.rare + "\n");
    }
}