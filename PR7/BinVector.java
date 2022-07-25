public class BinVector {
    public static void main(String[] args) {
        int[] w = {3, 7, 9, 11, 14, 20};
        int s = 16;

        int length = (int) Math.pow(2, w.length);
        for (int i = 0; i < length; i++) {
            StringBuilder x = new StringBuilder(Integer.toBinaryString(i));
            while (x.length() < w.length) x.insert(0, "0");
            int sum = 0;
            for (int j = 0; j < w.length; j++) {
                sum += (x.charAt(j) == '1') ? w[j] : 0;
            }
            if (s == sum) {
                System.out.println(x);
                break;
            }
        }
    }

}