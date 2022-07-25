public class FifthClass{
    public static void main(String[] args){
        Planet planet = new Planet("Mars-01", 3389.5, 228.0);
        System.out.println(planet.name);
        planet.setName("Mars");
        System.out.println(planet.getName());
        System.out.println(planet.toThousandKm("radius"));

        Satellite satellite = new Satellite("Fobos", 9337.0, 7.4);
        satellite.print();
        System.out.println(satellite.getPeriod());
        planet.set_Satellite("1",1.0,2.0);
        planet.getSatelliteInfo();
    }
}