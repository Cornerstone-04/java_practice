package components.week_7;
// Implementing Hybrid Inheritance Using Interface
public class Employee 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
 interface Salary 
{
    public void show();
}
 interface Pension 
{
    public void show();
}
	
	class Contract_Employee extends Employee implements Salary,Pension
{
    public void show()
    {
        System.out.println("show() method implementation");
    }
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
    public static void main(String args[])
    {
    	Contract_Employee Staff1 = new Contract_Employee();
        Staff1.dispD();
        Staff1.show();
        Staff1.dispA();
    }
}
