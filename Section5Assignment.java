package section5.assignment;
import java.util.Scanner;

public class Section5Assignment 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter career you want");
        String career=sc.next();
        MemberFactory mf=new MemberFactory(career);
    }
}

interface Staff
{
    int getSalary();
    short getYearsOfWork();
}

class TeachingAssistant implements Staff
{
    int salary=4000;
    short years=10;
    TeachingAssistant(int salary, short years)
    {
        this.salary=salary;
        this.years=years;
    }
    
    @Override
    public int getSalary()
    {
        return salary;
    }
    
    @Override
    public short getYearsOfWork()
    {
        return years;
    }
}

class Doctor implements Staff
{
    int salary=4000;
    short years=10;
    Doctor(int salary, short years)
    {
        this.salary=salary;
        this.years=years;
    }
    
    @Override
    public int getSalary()
    {
        return salary;
    }
    
    @Override
    public short getYearsOfWork()
    {
        return years;
    }
}

class MemberFactory
{
    int salary;
    short years;
    MemberFactory(String Career)
    {
        System.out.println("Enter Salary and years of work");
        Scanner sc=new Scanner(System.in);
        salary=sc.nextInt();
        years=sc.nextShort();
        
        if(Career.equals("TeachingAssistant"))
        {
            TeachingAssistant ta=new TeachingAssistant(salary, years);
            System.out.println("Teaching Assistant Salary = "+ta.getSalary());
            System.out.println("Teaching Assistant Years of Work = "+ta.getYearsOfWork());
        }
        else if(Career.equals("Doctor"))
        {
            Doctor d=new Doctor(salary, years);
            System.out.println("Doctor Salary = "+d.getSalary());
            System.out.println("Doctor Years of Work = "+d.getYearsOfWork());
        }
    }
}