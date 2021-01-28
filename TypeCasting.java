package assignment1;

public class TypeCasting {

	public static void main(String[] args) {
		//Implicit type Casting
		System.out.println("Implicit type Casting\n");
		char a = 'A';
		System.out.println("Value of char a: "+a);
		int b = a;
		System.out.println("Value of int b: "+b);
		float c = a;
		System.out.println("Value of float c: "+c);
		long d = a;
		System.out.println("Value of double d: "+d);
		double e = a;
		System.out.println("Value of double e: "+e);
	    //Explicit Conversion
		System.out.println("\nExplicit type Casting\n");
		double val = 45.67812345;
		System.out.println("Double value: "+val);
		int i = (int)val;
		System.out.println("Integer value of val: "+i);
		short s= (short)val;
		System.out.println("Short value : "+s);
		float f1 = (float)val;
		System.out.println("Float value: "+f1);
		long l1 = (long)val;
		System.out.println("Long value: "+l1);
		
		

	}

}
