public class InheritanceExample{
    public static void main(String[] args){
        Furniture furniture = new Furniture("Дерево",100.1);
        furniture.print();

        Chair chair = new Chair("Железо",300.003,"Смешной");
        chair.print();
        System.out.println(chair.toString());

    }
}