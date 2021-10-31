package person;

public class Person 
{
    String name, address, email;
    long phone;

    Person(String name, String address, String email, long phone)
    {
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone=phone;
    }
    void ToString()
    {
        System.out.println("Person's name is "+name);
    }
    
    public static void main(String[] args) 
    {
        Person p=new Person("Joy", "Shalaby", "hanyjoy800816@gmail.com", 2085398);
        Student std=new Student("freshman", "Joy", "Shalaby", "hanyjoy800816@gmail.com", 2085398);
        Employee e=new Employee(123, 3000, (short)14, (short)7, (short)2021, "Joy", "Shalaby", "hanyjoy800816@gmail.com", 2085398);
        Faculty f=new Faculty(8, 4, "Joy", "Shalaby", "hanyjoy800816@gmail.com", 2085398);
        Staff Stf=new Staff("Project Manager", "Joy", "Shalaby", "hanyjoy800816@gmail.com", 2085398);
        
        p.ToString();
        std.ToString();
        e.ToString();
        f.ToString();
        Stf.ToString();
    }
    
}
class Student extends Person
{
    final String status;
    Student(String status, String name, String address, String email, long phone)
    {
        super(name, address, email, phone);
        this.status=status;   
    }
    
    @Override
    void ToString()
    {
        System.out.println("Student's name is "+name);
    }
}
class Employee extends Person
{
    int office, salary;
    MyDate dateHired;
    
    Employee(int office, int salary, short day, short month, short year, String name, String address, String email, long phone)
    {
        this.office=office;
        this.salary=salary;
        dateHired=new MyDate(day, month, year);
    }
    
    @Override
    void ToString()
    {
        System.out.println("Employee's name is "+name);
    }
}
class Faculty extends Employee
{
    int officeHours, rank;
    
    Faculty(int officeHours, int rank, String name, String address, String email, long phone)
    {
        this.officeHours=officeHours;
        this.rank=rank;
    }
    
    @Override
    void ToString()
    {
        System.out.println("Faculty member's name is "+name);
    }
}
class Staff extends Employee
{
    String title;
    
    Staff(String title, String name, String address, String email, long phone)
    {
        this.title=title;
    }
    
    @Override
    void ToString()
    {
        System.out.println("Staff's name is "+name);
    }
}
class MyDate
{
    short day, month, year;
    
    MyDate(short day, short month, short year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
}
