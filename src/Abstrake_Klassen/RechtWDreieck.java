package Abstrake_Klassen;

public class RechtWDreieck extends Figur
{
    private double a, b;

    public double c()
    {
        return Math.sqrt(a * a + b * b);
    }

    public RechtWDreieck(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double flaeche()
    {
        return (a * b) / 2;
    }

    @Override
    public double umfang()
    {
        return a + b + c();
    }

    @Override
    public void ausgabe()
    {
        System.out.println("Seite c: " + c());
        super.ausgabe();
    }

    @Override
    public String toString()
    {
        return "RechtWDreieck{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
