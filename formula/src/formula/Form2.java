package formula;

public class Form2 implements Runnable {
	private double x;
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Form2(double x){
	this.x=x;
	}
	public  double  math(double x){
		double y;
		
		y= x/4;
		
		return y;

	}
	@Override
	public void run() {
		System.out.println("—читаем 2 часть: y2= "+math(x));
		
	}
}
