public class Dog
{
private String name;
private String type;
private String color;
private String size;
private double length;
private int age;

Dog(String n,String t,String c,String s,double l,int a)
{
this.name=n;
this.type=t;
this.color=c;
this.size=s;
this.length=l;
this.age=a;
}
private void Dogbarking()
{
System.out.println(name+" "+"is barking");
}
private double run(double s)
{
	double speed=s;
	return speed;
}
public static void main(String[] args)
{
	Dog dog1=new Dog("Tom","Husky","White","Max",5.5,4);
	System.out.println(dog1.name);
	dog1.Dogbarking();
	double speed1=dog1.run(19.2);
	System.out.println(speed1);


	Dog dog2=new Dog("Jerry","German Shepherd","Brown","Max",3.5,3);
	System.out.println(dog2.name);
	dog2.Dogbarking();
	double speed2=dog2.run(15.2);
	System.out.println(speed2);


	Dog dog3=new Dog("Max","Bull Dog","Black","Min",4.5,6);
	System.out.println(dog3.name);
	dog3.Dogbarking();
	double speed3=dog3.run(28.4);
	System.out.println(speed3);
}
}
