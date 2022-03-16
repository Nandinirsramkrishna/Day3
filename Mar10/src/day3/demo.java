package day3;

class car
{
	public static int gear,speed;
	boolean clutch,brake,accelerator;
	
	public void start()
	{
	}
	public void stop()
	{
	}
	
	public void setSpeed(int i)
	{
		speed=i;
	}
	public int getSpeed()
	{
		return speed;
	}
}
public class demo {

	public static void main(String[] args) {
		car c1,c2;
		c1=new car();
		c2=new car();
		c1.speed=40;
		c2.speed=100;
		System.out.println(car.speed);
		

	}

}
