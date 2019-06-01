import java.util.Scanner;
import java.util.function.Function;


public class Uebung18_1 {

    public static double iterate(double x0, int n, Function<Double, Double> func) {
        double x = x0;
        for (int i = 0; i < n; i++) {
            x = func.apply(x);
        }
        return x;
    }


    public static void a1() {
        double d1 = iterate(1, 50, (Double x) -> 2 * x);
        double d2 = iterate(100000, 10, (Double x) -> 0.5 * x);
        double d3;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("please enter a value in (0,1)");
            final double a = scanner.nextDouble();
            if (0 < a && a < 1) {
                d3 = iterate(5, 10, (Double x) -> a * x * (x - 1));
                break;
            }
            System.out.println("a not in (0,1)");
        }

        System.out.print(d1 + "\n" + d2 + "\n" + d3 + "\n");


    }

    public static void a2() {
        ApplyAndPrint.applyAndPrint(Fakultaet::fakultaetTopLevelStatic, 3,10);
        ApplyAndPrint.applyAndPrint(Fakultaet.NestedClass::fakultaetNestedClassStatic, 3, 10);

        Fakultaet fakultaet = new Fakultaet();
        ApplyAndPrint.applyAndPrint(fakultaet::fakultaetTopLevel, 3, 10);
        Fakultaet.NestedClass nestedClass = new Fakultaet.NestedClass();
        ApplyAndPrint.applyAndPrint(nestedClass::fakultaetNestedClass, 3, 10);

    }
}