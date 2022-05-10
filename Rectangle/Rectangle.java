public class Rectangle
{
double length;
double width;
Rectangle()
{
this.length=5;
this.width=2;
}


Rectangle(double length, double width)
{
setLength(5);
setWidth(2);
getLength();
getWidth();
getArea();
}



void setLength(double length)
{
length=length;
}


void setWidth(double width)
{
width=width;
}


double getLength( )
{
return length;
}


double getWidth( )
{
return width;
}


double getArea( )
{
return length*width;
}


public static void main(String[] args)
{
Rectangle obj1=new Rectangle();
obj1.Rectangle( );
obj1.Rectangle(5*2);

}


}
