package Abstrake_Klassen;

public class Kreis extends Figur
{
    private double r;

    public Kreis(double r)
    {
        super();
        this.r = r;
    }

    @Override
    public double flaeche()
    {
        return r * r * Math.PI;
    }

    @Override
    public double umfang()
    {
        return 2 * r * Math.PI;
    }

    @Override
    public void ausgabe()
    {
        System.out.println("Radius: " + r);
        super.ausgabe();
    }

    @Override
    public String toString()
    {
        return "Kreis{" +
                "r=" + r +
                '}';
    }
}
