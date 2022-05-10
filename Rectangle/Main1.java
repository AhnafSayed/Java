public class Main1
{
public static void main(String[]args)
{
Employee emp1=new Employee("Rana",20,12170703,"Dkaka",25000.0,"Marketing");	
emp1.showemp();
emp1.printSalary();
System.out.println();
Manager mgr1=new Manager("Tutul",25,12171704,"Tangail",30000.0,"Marketing");
mgr1.showmgr();
mgr1.printSalary();	
System.out.println();	
}
}