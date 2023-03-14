
class Encap
{
    private String name;
    
    // Setter Method
    public void setName(String naam)
    {
        name = naam;
    }

    //getter Method
    public String getName()
    {
        return name;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Encap obj = new Encap();
        obj.setName("Nitish");
        String outName = obj.getName();
        System.out.println(outName);
    }
}
 
