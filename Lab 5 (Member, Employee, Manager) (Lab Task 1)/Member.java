public class Member
 {
	String name;
	int age;
	String phonenumber;
	String address;
	double salary;
	public Member (String n,int a,String p,String ad,double s)
	{
		this.name=n;
		this.age=a;
		this.phonenumber=p;
		this.address=ad;
		this.salary=s;
	}
	public void printSalary()
	{
		System.out.println(salary);
	}
	public static void main(String[]args)
	{
		Employee ob1=new Employee("Rakib",30,"01888888888","Dhaka",50000,"Software Development");
		Manager ob2=new Manager("Akib",29,"01777777777","Khulna",70000,"Accountant");
		ob1.printSalary();
		ob2.printSalary();
		ob1.showInfo();
		ob2.showInfo();
	}
 }