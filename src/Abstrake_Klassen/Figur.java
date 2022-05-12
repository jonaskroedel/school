package Abstrake_Klassen;

import java.util.ArrayList;

public abstract class Figur
{
    public abstract double flaeche();
    public abstract double umfang();

    public void ausgabe()
    {
        System.out.println("Flaeche: " + flaeche());
        System.out.println(umfang());
        System.out.println("----------------");
    }

    public static void main(String[] args)
    {
        Rechteck r1 = new Rechteck(10, 20);
        Kreis k1 = new Kreis(20);
        RechtWDreieck rw1 = new RechtWDreieck(5, 4);
        Quadrat q1 = new Quadrat(5);

        ArrayList<Figur> ff = new ArrayList<>();
        ff.add(r1);
        ff.add(k1);
        ff.add(rw1);
        ff.add(q1);

        for (Figur figur : ff)
        {
            figur.ausgabe();
        }
    }
}
