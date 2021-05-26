import java.util.*;
public class Time
{
	private int hour, min, sec;
	Time(int h,int m,int s)
	{
		hour=h;
		min=m;
		sec=s;
	}
	Time()
	{
		hour=0;
		min=0;
		sec=0;
	}
	public Time add(Time a)
	{
		Time t=new Time();
		t.sec= this.sec + a.sec;
		t.min += this.min + a.min;
		t.hour += this.hour + a.hour;

		if(t.sec>60)
		{
			t.sec -=60;
			t.min++;
		}
		
		if(t.min>60)
		{
			t.min -=60;
			t.hour++;
		}
		
		if(t.hour>24)
		{
			t.hour -=24;
		}
		return t;
	}
	void display(String str)
	{
		System.out.println(str + " " + hour + ":" + min + ":" + sec);
	}
	public static void main(String []args)
	{
		Time t1=new Time(7,20,44);
		Time t2=new Time(10,7,5);
		Time t3=t1.add(t2);
		t1.display("Time 1 is : ");
		t2.display("Time 2 is : ");
		t3.display("Time after addition is: ");
	}
}