public class Main
{
	public static void main(String[] args)
	{
		Student student1=new Student("Kabir","Male",20,5.7,60,"18-35898-1",3.50,65);
		Student student2=new Student("Khan","Male",21,5.8,62,"18-35898-2",3.56,68);
		Faculty faculty1=new Faculty("Malek Ahmed","Male",41,5.9,72,"15-35898-2","CS",36);
		
		student1.sInfo();
		student2.sInfo();
		faculty1.facultyInfo();
	}
}