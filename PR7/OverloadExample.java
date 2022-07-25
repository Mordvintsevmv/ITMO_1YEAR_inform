public class OverloadExample{
    public static void main(String[] args){

        Plant p1 = new Plant();
        Plant p2 = new Plant("Пихта");
        Plant p3 = new Plant("Кактус", "Чёрный");
        Plant p4 = new Plant("Ель", "Красная", "Дом");
        Plant p5 = new Plant("Огромный мухомор", "Зелёный","Столовая", true);


        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
    }
}