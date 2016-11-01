package formula;

public class Main {

	public static void main(String[] args) throws InterruptedException  {
		Form1 fr1 = new Form1(2);
		Form2 fr2 = new Form2(7);
		
		Thread th1 = new Thread(fr1);
		Thread th2 = new Thread(fr2);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		System.out.println("Cчитаем всю дробь = " + fr1.math(fr1.getX())*fr2.math(fr2.getX()));
		
	}

}
