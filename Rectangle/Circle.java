public class Circle
{
       double radius;
	   double a;
	   
public void setRadius(double r)
{ 
    radius=r;
}
public double getRadius()
{
    return radius;
}
public void getArea()
{
  a=3.1416*radius*radius;
  System.out.println("Radius of Circle"  +a);
  

}

}