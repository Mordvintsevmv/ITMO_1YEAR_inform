public class Spy{
    public String name;
    private String realName;
    private Integer squad;

    private String getSpyInfo(){
        return ("Name -> " + this.name + "\nRealName -> " + this.realName + "\nSquad -> " + this.squad);
    }

    public void print(){
        System.out.println("Name -> " + this.name + "\nRealName -> " + this.realName + "\nSquad -> " + this.squad);
    }

    //set

    public void setName(String name){
        this.name = name;
    }

    public void setRealName(String RealName){
        this.realName = RealName;
    }

    public void setSquad(Integer squad){
        this.squad = squad;
    }

    //get

    public String getName(){
        return name;
    }

    public String getRealName(){
        return realName;
    }

    public Integer getSquad(){
        return squad;
    }

}