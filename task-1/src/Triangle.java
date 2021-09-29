public class Triangle {
    int a;
    int b;

    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double getPerimeter() {
        return a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    double getSquare() {
        return 0.5 * a * b;
    }
}
