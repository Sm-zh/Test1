public class Lab19 {
    public static void main(String[] args) {
        int s = sum(7);
        System.out.println(s);
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n-1);
    }
}
