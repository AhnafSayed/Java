public class Employee extends Member
{
	private String specilization;
	public Employee(String name,int age,int phone,String address,double sal,String specilization)
	{
	super(name,age,phone,address,sal);
	this.specilization=spc;
    }
public void showemp()
{
	System.out.println("name:"+super.name);
	System.out.println("age:"+super.age);
	System.out.println("phone:"+super.phone);
	System.out.println("address:"+super.address);
	System.out.println(":specilization"+specilization);
}
}	