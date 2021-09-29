import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Choose a variant: ");
            int choice = in.nextInt();
            switch (choice) {
                case 0:
                    TrueOrFalse trueOrFalse = new TrueOrFalse(in.nextInt());
                    System.out.println(trueOrFalse.checkValue());
                    break;
                case 1:
                    Formula formula = new Formula(in.nextInt(), in.nextInt(), in.nextInt());
                    System.out.println(formula.getResult());
                    break;
                case 2:
                    Triangle triangle = new Triangle(in.nextInt(), in.nextInt());
                    System.out.println("Perimeter: " + triangle.getPerimeter() + "\nSquare: "
                            + triangle.getSquare());
                    break;
                case 3:
                    CartesianCoordSys cartesianCoordSys = new CartesianCoordSys(in.nextDouble(), in.nextDouble());
                    System.out.println(cartesianCoordSys.checkCoords());
                    break;
                case 4:
                    Exponentiationer exponentiationer = new Exponentiationer(in.nextInt(), in.nextInt(), in.nextInt());
                    System.out.println();
                case 5:
                    SumFinder sumFinder = new SumFinder(in.nextInt(), in.nextInt(), in.nextInt());
                    System.out.println(sumFinder.getSum());
            }
        }
    }
}
