public class Square
{
  double side;
  double a;
  
  public void setSide(double s)
  {
     side=s;
  
  }
   public double getSide()
   {
     return side;
	
   
   }
   public void getArea()
   {
      a=side*side;
	  System.out.println("Area of Square"  +a);
   
   }




}