public class ShipTest{
    public static void main(String[] args){

        char c = 1059;
        Ship s = new Ship("Пробка","Лучший",777,c);

        s.updateShipInfo();

        c = 1050;
        s.updateShipInfo("Айсберг","Худший",000,c);

        s.updateShipInfo(true);

        s.updateShipInfo("ТуууТууууу");



    }
}