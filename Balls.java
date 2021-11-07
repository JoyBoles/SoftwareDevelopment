package balls;

interface Tossable
{
    void toss();
}

abstract class Ball implements Tossable
{
    private String brandName;
    public Ball(String brandName)
    {
        this.brandName=brandName;
    }
    
    public String getBrandName()
    {
        return brandName;
    }
    
    public abstract void bounce();
}

class Rock implements Tossable
{
    @Override
    public void toss()
    {
       System.out.println("Rock is tossed"); 
    }
}

class Baseball extends Ball
{
    Baseball(String brandName)
    {
        super(brandName);
    }

    @Override
    public void bounce() 
    {
        System.out.println("Baseball is bouncing");
    }

    @Override
    public void toss() 
    {
        System.out.println("Baseball is tossed");
    }
    
}

class Football extends Ball
{
    Football(String brandName)
    {
        super(brandName);
    }

    @Override
    public void bounce() 
    {
        System.out.println("Football is bouncing");
    }

    @Override
    public void toss() 
    {
        System.out.println("Football is tossed");
    }
    
}

public class Balls 
{
    public static void main(String[] args) 
    {
        Baseball bb=new Baseball("Wilson");
        Football fb=new Football("Nike");
        
        bb.bounce();
        bb.toss();
        
        fb.bounce();
        fb.toss();
    }
}
