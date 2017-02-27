package KomplexaTal;

/**
 * Created by alexander on 2017-02-27.
 */
public class Komplex {
    private int a; // Re
    private int b; // Im

    //Tar Re
    public int getA() {
        return a;
    }
    //Tar Im
    public int getB() {
        return b;
    }
    //konstruktor
    public Komplex(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //Lägger till "i"
    public String toString() {
        return a  + " + " + b + "i";
    }
    //Adderar talet med ett nytt tal
    public Komplex add(Komplex add) {
        return new Komplex(this.a + add.a, this.b + add.b);
    }
    //Multipliserar talet med ett nytt tal
    public Komplex multiply(Komplex multiply) {
        return new Komplex((this.a * multiply.a) - (this.b * multiply.b), (this.b * multiply.a) + (this.a * multiply.b));
    }
    //kollar om talet är lika med ett nytt tal
    public boolean equals(Komplex equals) {
        if (this.a == equals.a && this.b == equals.b) {
            return true;
        } else {
            return false;
        }
    }
    //räknar ut vilken i radianer.
    public double arg() {
        return Math.atan2(b, a);
    }
}
