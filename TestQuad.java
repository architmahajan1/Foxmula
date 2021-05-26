class Quad
{
	protected int x1,x2,x3,x4,y1,y2,y3,y4;
	protected void Coordinate(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		x1=a;
		y1=b;
		x2=c;
		y2=d;
		x3=e;
		y3=f;
		x4=g;
		y4=h;
	}
}

class Square extends Quad
{
	Square(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		Coordinate(a,b,c,d,e,f,g,h);
	}
	int area()
	{
		int d=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d*d;
	}
}

class Rectangle extends Quad
{
	Rectangle(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		Coordinate(a,b,c,d,e,f,g,h);
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;
	}
}
class Trapezoid extends Quad
{
	private int height;
	Trapezoid(int a,int b,int c,int d,int e,int f,int g,int h,int height)
	{
		Coordinate(a,b,c,d,e,f,g,h);
		this.height=height;
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2=(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		return (int)((d1+d2)*height)/2;
	}
}

class Parallelogram extends Quad
{
	private int height;
	Parallelogram(int a,int b,int c,int d,int e,int f,int g,int h,int height)
	{
		Coordinate(a,b,c,d,e,f,g,h);
		this.height=height;
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d1*height;
	}
}
public class TestQuad
{
	public static void main(String []args)
	{
		Square sq=new Square(20,20,10,10,10,20,10,20);
		System.out.println("Area Of The Square is " + sq.area());
		Rectangle rec=new Rectangle(15,15,35,15,35,25,15,25);
		System.out.println("Area Of The Rectangle is " + rec.area());
		Parallelogram p=new Parallelogram(10,10,30,10,20,20,0,20,8);
		System.out.println("Area Of The Parallelogram is " + p.area());
		Trapezoid t=new Trapezoid(15,15,35,15,35,25,0,15,25);
		System.out.println("Area Of The Trapezoid is " + t.area());
	}
}
