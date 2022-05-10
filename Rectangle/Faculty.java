public class Faculty extends Person
{
	String facultyid;
	String dept;
	int publish;
	
	public Faculty(String n,String g,int a,double w,double h,String id,String dp,int p)
	{
		super(n,g,a,w,h);
		this.facultyid=id;
		this.dept=dp;
		this.publish=p;
	}	
		public void facultyInfo()
		{
		System.out.println("Faculty 1");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Weight:"+weight);
		System.out.println("Faculty ID:"+facultyid);
		System.out.println("Faculty dept:"+dept);
		System.out.println("papers published:"+publish);
		}
	
}