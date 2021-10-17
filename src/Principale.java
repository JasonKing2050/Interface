import java.util.ArrayList;

public class Principale {

    public static void main(String[] args) {
        Nombre a = new Fraction(2,5);
        Nombre v = new NDouble(3.5);
        Nombre b = new Fraction(4,3);
        Nombre w = new NDouble(2.5);
        ArrayList<NDouble> t1 = new ArrayList<>();
        t1.add(new NDouble(1.5));
        t1.add(new NDouble(12.5));
        t1.add(new NDouble(-1.5));
        t1.add(new NDouble(345.5));
        t1.add(new NDouble(1.5322));
        t1.add(new NDouble(123.5));
        System.out.println(somme(t1));

        ArrayList<Fraction> t2 = new ArrayList<>();
        t2.add(new Fraction(4,3));
        t2.add(new Fraction(2,7));
        t2.add(new Fraction(23,3));
        t2.add(new Fraction(2,6));
        t2.add(new Fraction(2,3));
        t2.add(new Fraction(2,3));
        t2.add(new Fraction(2,3));
        t2.add(new Fraction(2,3));
        System.out.println(somme(t2));

        //System.out.println(a.add(b).toString());
        //System.out.println(v.add(w).toString());
    }
    public static <N extends Nombre< N >> Nombre<N> somme( ArrayList<N> tableau){

        N somme = null;
        if ( ! tableau.isEmpty()){
            somme = tableau.get(0);
            for (int i = 1 ; i < tableau.size() ; i++){
                somme = somme.add(tableau.get(i));
            }
        }
        return somme;
    }
}
