package sec1.week08;

public class ComplexityExample {

    public static int doN(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int doNTimesN(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                sum += k;
            }
        }
        return sum;
    }
}
