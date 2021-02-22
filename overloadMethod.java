
public class overloadMethod {
	
	public void area(int b,int h) {
		System.out.println("Area of Triangle "+(0.5 * b * h));
	}
	public void area(int r) {
		System.out.println("Area of circle "+3.14 * r * r);
	}

	public static void main(String[] args) {
		
		overloadMethod m1 = new overloadMethod();
		m1.area(6);
		m1.area(2, 5);

	}

}
