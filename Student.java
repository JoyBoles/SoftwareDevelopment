package student;
import java.util.Scanner;

public class Student {

    String name;
    private int ID;
    float GPA;
    Subject sub[];
    Address address;

    Student(String name, int ID, float GPA) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
    }
    
    void setSubject(int subNum)
    {
        Scanner sc=new Scanner(System.in);
        int subID, subHour;
        String subName;
        sub=new Subject[subNum];
        for(int i=0; i<subNum; i++)
        {
            System.out.println("Enter Subject ID");
            subID=sc.nextInt();
            System.out.println("Enter Subject Name");
            subName=sc.next();
            System.out.println("Enter Subject Hours");
            subHour=sc.nextInt();
            sub[i]=new Subject(subID, subName, subHour);
        }
    }
    
    void setAddress(int streetNo, String city, String country)
    {
        address=new Address(streetNo, city, country);
    }

    void display() {
        System.out.println("name: " + name + "\tID: " + ID + "\tGPA: " + GPA);       
        System.out.println("Address: "+address.streetNo+" "+address.city+" "+address.country);
        System.out.println("Subjects:");
        for(int i=0; i<sub.length;i++)
        {
            System.out.println(sub[i].ID+"  ==>  "+sub[i].name+"  ==>  "+sub[i].hours);
        }
    }

    public static void main(String[] args) {  //main program^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        Student std=new Student("Joy", 80027234, (float)3.27);
        std.setSubject(6);
        std.setAddress(139, "Minya", "Egypt");
        std.display();
    }
}

class Subject {

    int ID;
    String name;
    int hours;

    Subject(int ID, String name, int hours) {
        this.ID = ID;
        this.name = name;
        this.hours = hours;
    }
}

class Address {

    int streetNo;
    String city;
    String country;

    Address(int streetNo, String city, String country) {
        this.streetNo = streetNo;
        this.city = city;
        this.country = country;
    }
}
