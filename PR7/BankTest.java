public class BankTest{
    public static void main(String[] args){

        AccountInfo a1 = new AccountInfo("Миллиардер Миллионеров", 777, 12, "Хороший", "Зимбабвийские доллары", 10, -10000.0, 2.0);

        a1.print();
        a1.moneyAfterYear(5);
        a1.setName("Бедняк Богачёв");
        a1.setCurrency("Евро");
        a1.print();

    }
}