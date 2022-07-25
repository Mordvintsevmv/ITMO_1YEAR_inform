abstract class Storage{
    public abstract void store(String data);
    public abstract String read();
}

class CD extends Storage{
    private String data = "";

    public CD(){}

    @Override
    public void store(String data){
        this.data = data;
        System.out.println("Информация записана на CD");
    }

    @Override
    public String read(){
        return this.data;
    }
}

class SDCard extends Storage{
    private String data = "";
    public SDCard(){}

    @Override
    public void store(String data){
        this.data = data;
        System.out.println("Информация записана на SDCard");
    }

    @Override
    public String read() {
        return this.data;
    }
}

public class AbstractExample{
    public static void main(String[] args){
        CD cd = new CD();
        cd.store("Какая-то информация на CD");
        System.out.println(cd.read());

        SDCard sd = new SDCard();
        sd.store("Другая информауия на SDCard");
        System.out.println(sd.read());

        Storage storage = new Storage(){
            private String data = "";
            @Override
            public void store(String data){
                this.data = data;
                System.out.println("Информация записана на Storage");
            }

            @Override
            public String read() {
                return this.data;
            }
        };

        storage.store("Ещё какая-то информация, но на Storage");
        System.out.println(storage.read());

    }
}