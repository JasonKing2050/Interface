public class Fraction implements Nombre<Fraction>{

    protected int num;
    protected int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    @Override
    public Fraction add(Fraction x) {
        return new Fraction(num * x.den + den * x.num , den * x.den);
    }

    @Override
    public Fraction sub(Fraction x) {
        return new Fraction(num * x.den - den * x.num, den * x.den);
    }

    @Override
    public Fraction mul(Fraction x) {
        return new Fraction(num * x.num, den * x.den);
    }

    @Override
    public Fraction div(Fraction x) {
        return new Fraction(num * x.den, den * x.num);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", den=" + den +
                '}';
    }
}
