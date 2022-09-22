package j10thread;

class russia extends Thread
{
	int a=0;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("uk"+i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{				
				e.printStackTrace();
			}
		}
		System.out.println("sum"+a);
	}
}
class ukraine extends Thread
{
	int m=1;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("ukraine"+i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{				
				e.printStackTrace();
			}
		}
		 System.out.println("fact="+m);
	}
}
public class sumfact {

	public static void main(String[] args) throws InterruptedException {

		russia r1=new russia();
		ukraine u1=new ukraine();
		r1.start();
		u1.start();
		
		r1.join();
		u1.join();
		
		int total;
		total=u1.m+r1.a;
		System.out.println("Total="+total);
	}
}
