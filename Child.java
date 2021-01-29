package pack2;

import pack1.ProtectedAccessSpecifier;
import pack1.PublicAccessSpecifier;

public class Child extends ProtectedAccessSpecifier {
	
	public static void main(String args[]) {
		Child obj = new Child();
		System.out.println("From child class in pack2 calling protected method");
		obj.display();
		
		PublicAccessSpecifier objPack1 = new PublicAccessSpecifier();
		objPack1.display();
		
		ProtectedAccessSpecifierPack2 objProtPack2 = new ProtectedAccessSpecifierPack2();
		objProtPack2.displayPack2();
		
		DefaultAccessSpecifierPack2 objPack2 = new DefaultAccessSpecifierPack2();
		objPack2.displayDefault();
		
		
	}
	}
	
	
