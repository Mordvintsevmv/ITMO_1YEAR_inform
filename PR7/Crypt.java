import java.math.BigInteger;



public class Crypt {

    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int p = 43, q = 61;
        int n = p * q; //2623
        int phi = (p - 1) * (q - 1); //2520

        int e = 12;

        while ((isPrime(e) == false) || ((phi % e) == 0)){
            e++;
        }

        System.out.println("e: " + e);

        int d = 1;
        for (d = 1; d<phi; d++){
            if ((d*e)%phi == 1) {break;}
        }

        System.out.println("d: " + d);


        String text = "Тестирование";
        System.out.println("Текст: " + text);

        StringBuilder encResult = new StringBuilder();
        for (char ch : text.toCharArray()) {
            BigInteger r = BigInteger.valueOf((int) ch);
            BigInteger c = r.pow(e).mod(BigInteger.valueOf(n));
            encResult.append(c).append(" ");
        }
        System.out.println("Зашифрованная строка: " + encResult);

        StringBuilder decrRes = new StringBuilder();
        for (String c : encResult.toString().split(" ")) {
            BigInteger x = new BigInteger(c);
            x = x.pow(d).mod(BigInteger.valueOf(n));
            decrRes.append((char) x.intValue());
        }
        System.out.println("Расшифрованная строка: " + decrRes);

    }
}