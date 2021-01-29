package pack2;

import pack1.PublicAccessSpecifier;

public class MainPack2 {

	public static void main(String[] args) {
		DefaultAccessSpecifierPack2 obj = new DefaultAccessSpecifierPack2();
		obj.displayDefault();
		PublicAccessSpecifier objPack1 = new PublicAccessSpecifier();
		System.out.println("\nPublic method inside pack1 display insid pack2");
		objPack1.display();
		
	}

}
