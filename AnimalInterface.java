package animalinterface;

interface Animal
{
    public void eat();
    public void travel();
}

class Mammal
{
    private short legs;
    private String food;
    
    public Mammal(short legs, String food)
    {
        this.legs=legs;
        this.food=food;
    }
    
    public void eat()
    {
        System.out.println("Mammal is eating");
    }
    
    public void travel()
    {
        System.out.println("Mammal is travelling");
    }
    
    public short noOfLegs()
    {
        return legs;
    }
    
    public String favFood()
    {
        return food;
    }
}

public class AnimalInterface 
{
    public static void main(String[] args) 
    {
        Mammal m=new Mammal((short)4, "nuts");
        m.eat();
        m.travel();
        System.out.println("Number of legs = "+m.noOfLegs());
        System.out.println("Favourite food is "+m.favFood());
    }
}
