package Ex1;

public class Parabola {
    private final int a;
    private final int b;
    private final int c;

    public Parabola(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void MijSegDr(int a1, int b1, int c1) {
        double x1 = (double) -b1 / (2 * a1);
        double y1 = (-Math.pow(b1, 2)) / (4 * a1 * c1);
        double x = (double) -getB() / (2 * getA());
        double y = (-Math.pow(getB(), 2)) / (4 * getA() * getC());
        double xMij = (x + x1) / 2;
        double yMij = (y + y1) / 2;
        System.out.println("xMij = " + xMij + "; yMij = " + yMij);
    }

    public static void CalcMSD(Parabola p1, Parabola p2) {
        double x1 = (double) -p1.b / (2 * p1.a);
        double y1 = (-Math.pow(p1.b, 2)) / (4 * p1.a * p1.c);
        double x2 = (double) -p2.b / (2 * p2.a);
        double y2 = (-Math.pow(p2.b, 2)) / (4 * p2.a * p2.c);
        double xMij = (x2 + x1) / 2;
        double yMij = (y2 + y1) / 2;
        System.out.println("Cerinta5:");
        System.out.println("xMij = " + xMij + "; yMij = " + yMij);
    }

    public double Lungime(int a1, int b1, int c1) {
        double x1 = (double) -b1 / (2 * a1);
        double y1 = (-Math.pow(b1, 2)) / (4 * a1 * c1);
        double x = (double) -getB() / (2 * getA());
        double y = (-Math.pow(getB(), 2)) / (4 * getA() * getC());
        return Math.hypot(x - x1, y - y1);
    }

    public static double CalcLung(Parabola p1, Parabola p2) {
        double x1 = (double) -p1.b / (2 * p1.a);
        double y1 = (-Math.pow(p1.b, 2)) / (4 * p1.a * p1.c);
        double x2 = (double) -p2.b / (2 * p2.a);
        double y2 = (-Math.pow(p2.b, 2)) / (4 * p2.a * p2.c);

        return Math.hypot(x2 - x1, y2 - y1);
    }

    public int[] CalcVarf(int a, int b, int c) {
        int[] v = {0,1};
        return v;
    }

    @Override
    public String toString() {
        return "f(x) = " + a + "x^2 + " + b + "x +" + c;
    }
}
