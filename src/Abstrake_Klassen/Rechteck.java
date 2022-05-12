package Abstrake_Klassen;

public class Rechteck extends Figur
{
    private double laenge, breite;

    public Rechteck(double laenge, double breite)
    {
        super();
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double flaeche()
    {
        return laenge * breite;
    }

    @Override
    public double umfang()
    {
        return 2 * (laenge + breite);
    }

    @Override
    public void ausgabe()
    {
        System.out.println("Laenge: " + laenge);
        System.out.println("Breite: " + breite);
        super.ausgabe();
    }

    @Override
    public String toString()
    {
        return "Rechteck{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                '}';
    }
}
