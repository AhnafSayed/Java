public class Student extends Person
{
	String studentid;
	double cgpa;
	int credit;
	
	public Student(String n,String g,int a,double w,double h,String id,double cg,int cr)
	{
		super(n,g,a,w,h);
		this.studentid=id;
		this.cgpa=cg;
		this.credit=cr;
	}
	
	public void sInfo()
	{
		System.out.println("Student 1");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Weight:"+weight);
		System.out.println("Id:"+studentid);
		System.out.println("CGPA:"+cgpa);
		System.out.println("Credit completed:"+credit);
	}
}