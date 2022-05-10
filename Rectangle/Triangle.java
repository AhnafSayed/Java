public class Triangle{
 
 double height;
 double base;
 double a;
 double b,h;

 public Triangle()
 {
  this.height=10.5;
  this.base=5.7;
  
 }
 public Triangle (double h,double b)
 {
   height=h;
   base=b;
   
 
 }
 public void setHeight(double height)
 {
      height=h;
	  
 
 }
public void setBase(double base)
{  
   base=b;

}
public double getHeight()
{
   return height;
}
public double getBase()
{
   return base;
}
public void getArea()
{
   a=0.5*height*base;
   System.out.println("Area of Triangle" +a);

}









}