public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction()
    {
        setNumerator(0);
        setDenominator(1);
    }

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public static Fraction Add(Fraction fraction1)
    {
       //answer = number*(numerator/denominator);
    }

    public String toString()
    {
        return getNumerator() + "/" + getDenominator();
    }
}
