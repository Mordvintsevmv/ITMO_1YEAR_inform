public class Main {
    public static void main(String[] args) {
        hanoi(5, 1, 3);
    }

    public static void hanoi(int n, int i, int j) {
        int p = 6 - i - j;
        if (n == 0) return;
        hanoi(n - 1, i, p);
        System.out.println("переложить " + n + " диск c " + i + " на " + j + " стержнь ");
        hanoi(n - 1, p, j);
    }
}