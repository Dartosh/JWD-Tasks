public class Exponentiationer {
    int a;
    int b;
    int c;

    Exponentiationer(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        getExp(this.a);
        getExp(this.b);
        getExp(this.c);
    }

    void getExp(int num) {
        if(num >= 0)
            System.out.println(num + ": " + Math.pow(num, 2));
        else
            System.out.println(num + ": " + Math.pow(num, 4));
    }
}
