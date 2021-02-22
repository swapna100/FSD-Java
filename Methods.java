
public class Methods {
	
	public int multiplynumbers(int a, int b) {
		
		int z = a * b;
		return z;
	}

	public static void main(String[] args) {
		
		Methods m1 = new Methods();
		int ans = m1.multiplynumbers(10, 3);
		System.out.println("Multiplication is "+ans);
		
	}

}
