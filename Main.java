package KomplexaTal;

/**
 * Created by alexander on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {
        Komplex tal1 = new Komplex(2, 2);
        Komplex tal2 = new Komplex(4, 4);

        System.out.println("Tal1: " + tal1.toString());
        System.out.println("Tal2: " + tal2.toString());
        System.out.println("Tal1 + Tal2: " + tal1.add(tal2).toString());
        System.out.println("Tal1 * Tal2: " + tal1.multiply(tal2).toString());
        System.out.println("Är Tal1 = Tal2? " + tal1.equals(tal2));
        System.out.println("Vinkeln i radianer Tal1: " + tal1.arg());
        System.out.println("Vinkeln i radianer Tal2: " + tal2.arg());
    }

}
