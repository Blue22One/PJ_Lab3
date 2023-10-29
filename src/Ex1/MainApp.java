package Ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        List<Parabola> parabolaList = new ArrayList<Parabola>();
        String path = "D:\\Facultate\\Anul III\\Semestrul I\\PJ\\Laborator\\Lab3\\src\\Ex1\\in.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        Parabola parabola;
        int a, b, c;

        while ((line = br.readLine()) != null) {
            String[] aux = line.split(" ");
            a = Integer.parseInt(aux[0]);
            b = Integer.parseInt(aux[1]);
            c = Integer.parseInt(aux[2]);
            parabola = new Parabola(a, b, c);
            parabolaList.add(parabola);
        }


        // parabola citita de la tastatura (iti da a,b,c)
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        int aIn = scanner.nextInt();
        System.out.println("b=");
        int bIn = scanner.nextInt();
        System.out.println("c=");
        int cIn = scanner.nextInt();

        System.out.println("Cerinta4:");
        for (Parabola p : parabolaList) {
            System.out.println(p.toString());
            double x = (double) -p.getB() / (2 * p.getA());
            double y = (-Math.pow(p.getB(), 2)) / (4 * p.getA() * p.getC());
            System.out.println("Varful parabolei are coordonatele: x = " + String.format("%.2f", x) + " si y = " + String.format("%.2f", y));
            p.MijSegDr(aIn, bIn, cIn);
            System.out.println("Cerinta 6 - Lungime segment = " + String.format("%.2f", p.Lungime(aIn, bIn, cIn)));
        }

        List<Parabola> lista = new ArrayList<Parabola>();
        lista.add(initParab());
        lista.add(initParab());
        Parabola.CalcMSD(lista.get(0), lista.get(1));
        System.out.println("Cerinta 7:");
        System.out.println("Lungime = " + String.format("%.2f", Parabola.CalcLung(lista.get(0), lista.get(1))));
        scanner.close();
    }

    public static Parabola initParab() {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("a=");
        a = scan.nextInt();
        System.out.println("b=");
        b = scan.nextInt();
        System.out.println("c=");
        c = scan.nextInt();
        return new Parabola(a, b, c);
    }
}
