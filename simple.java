package j10thread;

public class simple {

	public static void main(String[] args) {
		
		Thread th1=new Thread();
		Thread th2=new Thread();
		Thread th3=new Thread();
		
		System.out.println(th1);
		System.out.println(th2);
		System.out.println(th3);
		
		th1.setName("Dev");
		th1.setPriority(10);
		
		System.out.println(th1);
		System.out.println(th2);
		System.out.println(th3);

	}
}
