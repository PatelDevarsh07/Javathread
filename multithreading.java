package j10thread;

class usa extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("usa"+i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{				
				e.printStackTrace();
			}
		}
	}
}
class uk extends Thread
{
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
	}
}
public class multithreading {

	public static void main(String[] args) {
		
     usa u1=new usa();
     uk u2=new uk();
     u1.start();
     u2.start();		
	}
}

