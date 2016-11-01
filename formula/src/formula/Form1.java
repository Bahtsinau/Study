package formula;



public class Form1 implements Runnable{
	private double x;
	
	
	
	public Form1(double x){
		this.x = x;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double math(double x){
		double y;
		
		
		y= (x*x+x*x*x)/(x*3+x*7);
		
		return y;
	}
	
	
	@Override
	public void run() {
		
		System.out.println("—читаем 1 часть: y1= " + math(x));
	
		
		
	}
}


