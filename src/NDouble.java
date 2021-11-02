public class NDouble implements Nombre<NDouble>{

    double x;

    public NDouble(double x) {
        this.x = x;
    }

    @Override
    public NDouble add(NDouble x) {
        return new NDouble(this.x + x.x);
    }

    @Override
    public NDouble sub(NDouble x) {
        return new NDouble(this.x - x.x);
    }

    @Override
    public NDouble mul(NDouble x) {
        return new NDouble(this.x * x.x);
    }

    @Override
    public NDouble div(NDouble x) {
        return new NDouble(this.x / x.x);
    }

    @Override
    public String toString() {
        return String.format("NDouble{" +
                "x= %.2f }", x);
    }
}
