public class Ship{
    private String title;
    private String capitanName;
    private int port;
    private char type;

    public Ship(String title, String capitanName, int port, char type){
        this.title = title;
        this.capitanName = capitanName;
        this.port = port;
        this.type = type;
    }

    public void updateShipInfo(){
        System.out.println("Было:\t     \t\t\tСтало:");
        System.out.print("Название: " + this.title + "\t-->\t");
        System.out.println("Название: " + this.title);

        System.out.print("Капитана: " + this.capitanName + "\t-->\t");
        System.out.println("Капитан: " + this.capitanName);

        System.out.print("Порт: " + this.port + "\t        -->\t");
        System.out.println("Порт: " + this.port);

        System.out.print("Тип: " + this.type + "\t                -->\t");
        System.out.println("Тип: " + this.type);
        System.out.println();
    }

    public void updateShipInfo(String title, String capitanName, int port, char type){
        System.out.println("Было:\t     \t\t\tСтало:");
        System.out.print("Название: " + this.title + "\t-->\t");
        this.title = title;
        System.out.println("Название: " + this.title);

        System.out.print("Капитана: " + this.capitanName + "\t-->\t");
        this.capitanName = capitanName;
        System.out.println("Капитан: " + this.capitanName);

        System.out.print("Порт: " + this.port + "\t        -->\t");
        this.port = port;
        System.out.println("Порт: " + this.port);

        System.out.print("Тип: " + this.type + "\t                -->\t");
        this.type = type;
        System.out.println("Тип: " + this.type);
        System.out.println();
    }

    public void updateShipInfo(boolean b){
        if (b == true) {
            System.out.println("Было:\t     \t\t\tСтало:");
            System.out.print("Название: " + this.title + "\t-->\t");
            this.title = "";
            System.out.println("Название: " + this.title);

            System.out.print("Капитана: " + this.capitanName + "\t-->\t");
            this.capitanName = "";
            System.out.println("Капитан: " + this.capitanName);

            System.out.print("Порт: " + this.port + "\t\t        -->\t");
            this.port = 0;
            System.out.println("Порт: " + this.port);

            System.out.print("Тип: " + this.type + "\t                -->\t");
            char c = 1000;
            this.type = c;
            System.out.println("Тип: " + this.type);
            System.out.println();
        }
        else {
            System.out.println("Было:\t     \t\t\tСтало:");
            System.out.print("Название: " + this.title + "\t-->\t");
            System.out.println("Название: " + this.title);

            System.out.print("Капитана: " + this.capitanName + "\t-->\t");
            System.out.println("Капитан: " + this.capitanName);

            System.out.print("Порт: " + this.port + "\t\t        -->\t");
            System.out.println("Порт: " + this.port);

            System.out.print("Тип: " + this.type + "\t                -->\t");
            System.out.println("Тип: " + this.type);
            System.out.println();
        }
    }

    public void updateShipInfo(String title){
        System.out.println("Было:\t     \t\t\tСтало:");
        System.out.print("Название: " + this.title + "\t-->\t");
        this.title = title;
        System.out.println("Название: " + this.title);

        System.out.print("Капитана: " + this.capitanName + "\t-->\t");
        System.out.println("Капитан: " + this.capitanName);

        System.out.print("Порт: " + this.port + "\t        -->\t");
        System.out.println("Порт: " + this.port);

        System.out.print("Тип: " + this.type + "          -->\t");
        System.out.println("Тип: " + this.type);
        System.out.println();
    }

    //public void updateShipInfo(String capitanName){
        //System.out.println("Было:\t     \t\t\tСтало:");
        //System.out.print("Название: " + this.title + "\t-->\t");
        //System.out.println("Название: " + this.title);

        //System.out.print("Капитана: " + this.capitanName + "\t-->\t");
        //this.capitanName = capitanName;
        //System.out.println("Капитан: " + this.capitanName);

        //System.out.print("Порт: " + this.port + "\t        -->\t");
        //System.out.println("Порт: " + this.port);

        //System.out.print("Тип: " + this.type + "\t                -->\t");
        //System.out.println("Тип: " + this.type);
        //System.out.println();
    //}



}