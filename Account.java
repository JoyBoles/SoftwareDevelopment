package account;

class Date
{
    short day;
    short month;
    short year;
}

public class Account 
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    Account()
    {
        id=0;
        balance=0;
        annualInterestRate=0;
    }
    
    Account(int id, double balance)
    {
        this.id=id;
        this.balance=balance;
    }
    
    void setID(int id)
    {
        this.id=id;
    }
    
    int getID()
    {
        return id;
    }
    
    void setBalance(double balance)
    {
        this.balance=balance;
    }
    
    double getBalance()
    {
        return balance;
    }
    
    void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
    }
    
    double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    void setDate(short d, short m, short y)
    {
        dateCreated.day=d;
        dateCreated.month=m;
        dateCreated.year=y;
    }
    
    Date getDate()
    {
        return dateCreated;
    }
    
    double getMonthlyInterestRate()
    {
        return annualInterestRate/12.0;
    }
    
    void withdraw(int amount)
    {
        balance-=amount;
    }
    
    void deposit(int amount)
    {
        balance+=amount;
    }
    
    public static void main(String[] args) 
    {
        Account acc=new Account(1122, 20000);
        acc.setDate((short)24,(short)10,(short)2021);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println(acc.getBalance());
        System.out.println(acc.getMonthlyInterestRate());
        
        Date date=new Date();
        date=acc.getDate();
        System.out.println(date.day+"/"+date.month+"/"+date.year);
    }  
}
