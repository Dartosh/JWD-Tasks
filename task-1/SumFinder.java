public class SumFinder {
    int a;
    int b;
    int c;

    SumFinder(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getSum() {
        int min = a;
        int max = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max + min;
    }
}
