package j10thread;

class china implements Runnable
{
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("china"+i);
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
public class implemented {

	public static void main(String[] args) {
		
		china c1=new china();
		Thread th1=new Thread(c1);
		
		th1.start();
	}
}
