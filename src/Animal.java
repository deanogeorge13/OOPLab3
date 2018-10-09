public class Animal {
    private String type;
    private String[] continents;
    private float weight;
    private int age;

    public Animal()
    {
        this.type = "No type specified";
        this.continents = null;
        this.weight = 0.0f;
        this.age = 0;
    }

    public Animal(String type, String[] continents, float weight, int age)
    {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }


    public String getType()
    {
        return type;
    }

    // public String[] getContinents()
    // {
    //      return continents;
    //   }

    public float getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }




    public void setType(String type)
    {
        this.type = type;
    }

    public void setContinents(String[] continents)
    {
        this.continents = continents;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


@Override
    public String toString()
    {
        String conts="";

        if(continents==null)
        {
            conts="AAAAA";
        }
else {
            for (int i = 0; i < continents.length; i++) {
                conts += continents[i] + " ";
            }
        }
        return "Type: " + getType() + "\nContinents: " + conts + "\nWeight: " + getWeight() + "\nAge: " + getAge();
    }
}
