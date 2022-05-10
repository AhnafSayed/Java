public class Manager extends Member 
{
	String department;
	public Manager(String n,int a,String p,String ad,double s,String d)
	{
		super(n,a,p,ad,s);
		this.department=d;
	}
	public void showInfo()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phonenumber);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(department);
	}
}