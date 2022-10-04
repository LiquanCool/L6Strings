public class BabyParrot
{
    private String species;
    private int age;
    private String name;

    public BabyParrot(String species, int age)
    {
        this.species = species;
        this.age = age;
        this.name = ""; // use a default value of empty string
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        String str = "Species: " + species + "\n";
        str += "Name: " + name + ", Age: " + age;
        return str;
    }
}
