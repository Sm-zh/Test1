class Lab20 {
    public static void main(String[] args) {
        double x = 169;
        double fact = factorial(x);
        System.out.println(fact);
        System.out.println(4.2690680090047027E304*170);
    }

    static double factorial(double x) {
        double fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= (x/(int) x) * (i);
        }
        //fact *= 7.92323612966;
        return fact;
    }
}