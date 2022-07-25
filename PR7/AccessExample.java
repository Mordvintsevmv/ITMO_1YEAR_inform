public class AccessExample {
    public static void main(String[] args) {
        Cube c = new Cube(5, 4, 3);
        c.print();
        System.out.println();
        System.out.println(c.width);
        System.out.println(c.depth);
        //System.out.println(c.height);
        System.out.println();

        //Spy

        Spy sp = new Spy();
        sp.setName("Михаил");
        sp.setRealName("Зубенко");
        sp.setSquad(3);
       // System.out.println(sp.getSpyInfo());
        sp.print();
        System.out.println(sp.getName());
        System.out.println(sp.getRealName());
        System.out.println(sp.getSquad());


    }
}
