public class Rectangle1
{
	double length,width;
	public Rectangle()
	{
		length=15.00;
		width=9.00;
		System.out.println("length="+length+"    width="+width);
	}
	public Rectangle(double l,double w)
	{
		length=l;
		width=w;
		System.out.println("length="+length+"    width="+width);
	}
	void setLength(double l)
	{
		length=l;
		System.out.println("length="+length);
	}
	void setwidth(double w)
	{
		width=w;
		System.out.println(" width="+width);
	}
    double getlength()
	{
		return length;
	}
	double getwidth()
	{
		return width;
	}
	double getArea()
	{
	    double a=width*length;
		 return a;

	}
	public static void main(String[] args)
	{
		Rectangle obj=new Rectangle(5.00,2.00);

		System.out.println("area of Rectangle :"+obj.getArea());
		obj.setLength(9.00);
		obj.setwidth(6.00);
		System.out.println("area of Rectangle :"+obj.getArea());
	}

}