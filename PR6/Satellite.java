public class Satellite{
    String name;
    double radius;
    double period;

    public Satellite(String name, Double radius, Double period){
        this.name = name;
        this.radius = radius;
        this.period = period;
    }

    public double getPeriod(){
        return this.period;
    }

    public double getPeriodInDays(){
        return this.period / 24;
    }

    public void print(){
        System.out.println("Название спутника - " + this.name);
        System.out.println("Радиус спутника - " + this.radius);
        System.out.println("период вращения спутника - " + this.period);
    }
}