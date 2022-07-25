public class SecondClass{
    public static void main(String[] args){
        String s = "13.7";
        Double a = new Double(s);
        char c = "qwe".charAt(2); // Символ на второй позиции
        System.out.println(a);
        System.out.println(c);

        // Самостоятельная работа

        // 6
        String v = "135";
        Integer iS1 = new Integer(v);
        Integer iS2 = Integer.parseInt(v);
        System.out.println();

        System.out.println(iS1);
        System.out.println(iS2);
        System.out.println();

        // 7
        String s1 = "Java is one of the best languages!";
        char c1 = s1.charAt(5);
        System.out.println("5 символ -> " + c1);
        System.out.println("Сравнение строк ->" + (s1 == "Java is one of the most beautiful languages!"));
        System.out.println("\"best\" начинается с " + s1.indexOf("best"));
        System.out.println(s1.equals("Java is one of the most beautiful languages!"));
    }

}