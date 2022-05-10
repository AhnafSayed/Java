public class Member
{
	String name;
	int age;
	int phone;
	String address;
	double salary;
	public Member (String n,int age,int phone,String address,double sal)
	
	this.name=n;
	this.age=age;
	this.phone=phone;
	this.address=address;
	this.salary=sal;
}
public void printSalary()
{
	System.out.println("salary is "+salary);
}
