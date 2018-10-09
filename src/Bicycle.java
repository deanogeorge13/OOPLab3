public class Bicycle {
    private String name;
    private double value;
    private String make;

    public Bicycle()
    {
        setName("Unknown");
        setValue(0);
        setMake(" ");
    }

    public Bicycle(String name,double value,String make)
    {
        setName(name);
        setValue(value);
        setMake(make);
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void increaseValue(int valueIncrease)
    {
        value += valueIncrease;
    }

    public void translate(int valueIncrease)
    {
        increaseValue(valueIncrease);
    }

    public String toString()
    {
        return "Name: " + name + "\nValue: " + value + "\nMake: " + make;
    }
}
