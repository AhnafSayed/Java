public class Manager extends Member
{
	private String department;
	public Manager(String n,int age,int phone,String address,double sal,String department)
	{
	super(name,age,phone,address,sal);
	this.department=dep;
	}
public void showmgr()
{
	System.out.println("name:"+super.name);
	System.out.println("age:"+super.age);
	System.out.println("address:"+super.address);
	System.out.println("Depertment:"+depertment);
}
}