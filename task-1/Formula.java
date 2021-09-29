public class Formula {
    int a;
    int b;
    int c;

    Formula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getResult() {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / ( 2 * a ) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
