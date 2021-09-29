public class CartesianCoordSys {
    double x;
    double y;

    CartesianCoordSys(double x, double y) {
        this.x = x;
        this.y = y;
    }

    boolean checkCoords() {
        return (x >= -2 && x <= 2 && y >= 0 && y <= 4) ||
                (x >= -4 && x <= 4 && y >= -3 && y <= 0);
    }
}
