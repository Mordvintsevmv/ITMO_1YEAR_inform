public class Planet{
    String name;
    Double radius;
    Double sunDistance;
    Satellite satellite;


    public void getSatelliteInfo(){
        this.satellite.print();
    }


    public void set_Satellite(String name, Double radius, Double period){
        this.satellite = new Satellite(name,radius, period);
    }

    public Planet(String name, Double radius, Double sunDistance){
        this.name = name;
        this.radius = radius;
        this.sunDistance = sunDistance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double toThousandKm(String param){
        double result = 0;
        switch (param){
            case "sunDistance":
                result = this.sunDistance / 1000;
                break;
            case "radius":
                result = this.radius / 1000;
                break;
        }
        return result;
    }


}