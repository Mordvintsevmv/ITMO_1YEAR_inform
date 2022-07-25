public class AccountInfo extends HolderInfo{
    private double limit;
    private double money;
    private String currency;
    private double percent;

    public AccountInfo(String name, int ID, int age, String charac, String currency, double money, double limit, double percent){
        super(name, ID, age, charac);
        this.limit = limit;
        this.money = money;
        this.currency = currency;
        this.percent = percent;
    }

    public void setLimit(double limit){
        this.limit = limit;
    }

    public double getLimit(){
        return this.limit;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public double getMoney(){
        return this.money;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String getCurrency(){
        return this.currency;
    }

    public void setPercent(double percent){
        this.percent = percent;
    }

    public double getPercent(){
        return this.percent;
    }

    public void moneyAfterYear(double year){
        System.out.println("Счёт после " + year + " лет: " + (this.money + this.money * Math.pow(this.percent,year)/100));
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Валюта: " + this.currency + "\nДеньги: " + this.money + "\nЛимит: " + this.limit + "\nПроценты: " + this.percent + "\n");
    }
}