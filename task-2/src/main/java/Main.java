import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Choose a variant: ");
            int choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Task 1\n");
                    System.out.println(trueOrFalse(in.nextInt()));
                    break;
                case 1:
                    System.out.println("Task 2\n");
                    System.out.println(getFormula(in.nextInt(), in.nextInt(), in.nextInt()));
                    break;
                case 2:
                    System.out.println("Task 3\n");
                    int a = in.nextInt(), b = in.nextInt();
                    System.out.println("Perimeter: " + getPerimeter(a, b) + "\nSquare: " + getSquare(a, b));
                    break;
                case 3:
                    System.out.println("Task 4\n");
                    System.out.println("Is a point coordinates have valid values: " +
                            checkCoords(in.nextInt(), in.nextInt()));
                    break;
                case 4:
                    System.out.println("Task 5\n");
                    getExp(in.nextInt());
                    getExp(in.nextInt());
                    getExp(in.nextInt());
                    break;
                case 5:
                    System.out.println("Task 6\n");
                    System.out.println(getSum(in.nextInt(), in.nextInt(), in.nextInt()));
                    break;
                case 6:
                    System.out.println("Task 7\n");
                    getFunction(in.nextInt(), in.nextInt(), in.nextInt());
                    break;
                case 7:
                    System.out.println("Task 8\n");
                    multiplicityCheck(in.nextInt(), in.nextInt());
                    break;
                case 8:
                    arraysUnion(in.nextInt(), in.nextInt(), in.nextInt());
                    break;
            }
        }
    }

    static boolean trueOrFalse(int value) {
        try {
            if(Integer.toString(value).length() != 4)
                throw new IOException("Length of the number less than 4");

            String str = Integer.toString(value);

            return Integer.parseInt(Character.toString(str.charAt(0))) +
                    Integer.parseInt(Character.toString(str.charAt(1))) ==
                    Integer.parseInt(Character.toString(str.charAt(2))) +
                            Integer.parseInt(Character.toString(str.charAt(3)));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    static double getFormula(int a, int b, int c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) /
                ( 2 * a ) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    static double getPerimeter(int a, int b) {
        return a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    static double getSquare(int a, int b) {
        return 0.5 * a * b;
    }

    static boolean checkCoords(int x, int y) {
        return (x >= -2 && x <= 2 && y >= 0 && y <= 4) ||
                (x >= -4 && x <= 4 && y >= -3 && y <= 0);
    }

    static void getExp(int num) {
        if(num >= 0)
            System.out.println(num + ": " + Math.pow(num, 2));
        else
            System.out.println(num + ": " + Math.pow(num, 4));
    }

    static int getSum(int a, int b, int c) {
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

    static void getFunction(int a, int b, int h) {
        int[] numbers = new int[(b - a) / h];
        numbers[0] = a;
        for(int i = 0; i < numbers.length - 2; i++) {
            numbers[i + 1] = numbers[i] + h;
        }
        numbers[numbers.length - 1] = b;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + ": " + (Math.pow(Math.sin(numbers[i]), 2) - Math.cos(2 * numbers[i])));
        }

    }

    static void multiplicityCheck(int n, int k) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(numbers[i] % k == 0) {
                System.out.println(numbers[i]);
            }
        }
    }

    static void arraysUnion(int n1, int n2, int k) {
        Scanner in = new Scanner(System.in);
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        int[] array3 = new int[n1 + n2];
        for(int i = 0; i < n1; i++)
            array1[i] = in.nextInt();
        for(int i = 0; i < n2; i++)
            array2[i] = in.nextInt();

        if(k < n1) {
            for(int i = 0; i <= k; i++)
                array3[i] = array1[i];
            for(int i = 0; i < n2; i++)
                array3[k + 1 + i] = array2[i];
            for(int i = k + 1; i < n1; i++)
                array3[k + n2 - 1+ i] = array1[i];

            System.out.println(array3);
        }
        else
            System.out.println("k > n1!!!");

    }
}
