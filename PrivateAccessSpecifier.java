package pack1;

 class PrivateAccessSpecifier {
	private void display() {
		System.out.println("\nThis is Private method1 inside different class and same package");
		System.out.println("I am only accessible outside class through public method");
		
	}
	
	public static void name() {
		PrivateAccessSpecifier obj = new PrivateAccessSpecifier();
		obj.display();
		
	}

}
