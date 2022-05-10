public class Employee extends Member
{
	String specialization;
	public Employee(String n,int a,String p,String ad,double s,String sp)
	{
		super(n,a,p,ad,s);
		this.specialization=sp;
	}
	public void showInfo()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phonenumber);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(specialization);	
	}
}