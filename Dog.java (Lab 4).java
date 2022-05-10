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
public void Dogbarking()
{
	System.out.println(name+" "+"is barking!");
}
public double run(double s)
{
	double speed=s;
	return speed;
}

public void setName(String n)
{
	name=n;
}   
public String getName()
{
	return name;
}
public void setColor(String c)
{
	color=c;
}
public String getColor()
{
	return color;
}
}