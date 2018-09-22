package KlasserOgObjekter1;

public class Kalkulator {

    public static double addere(double tall1, double tall2) {

        double sum = tall1 + tall2;

        return sum;
    }

    public static double subtrahere(double tall1, double tall2) {

        double sum = tall1 - tall2;

        return sum;
    }

    public static double multiplisere(double tall1, double tall2) {

        double sum = tall1 * tall2;

        return sum;
    }

    public static double dividere(double tall1, double tall2) {

        double sum = tall1 / tall2;

        return sum;
    }


    public static void main(String[] args) {

        System.out.println("123 + 123 er "+Kalkulator.addere(123, 123));
        System.out.println("123 - 123 er "+Kalkulator.subtrahere(123, 123));
        System.out.println("123 * 123 er "+Kalkulator.multiplisere(123, 123));
        System.out.println("123 / 123 er "+Kalkulator.dividere(123, 123));

    }
}
