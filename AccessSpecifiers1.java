package pack1;

import pack2.PublicAcessSpecifierPack2;

public class AccessSpecifiers1 {

	public static void main(String[] args) {
		defAccessSpecifier defAccessSpecifierObj = new defAccessSpecifier();
		defAccessSpecifierObj.display();
		
		PublicAccessSpecifier publicAccessSpecifierObj = new PublicAccessSpecifier();
		publicAccessSpecifierObj.display();
		
		ProtectedAccessSpecifier protectedAccessSpecifierObj = new ProtectedAccessSpecifier();
		protectedAccessSpecifierObj.display();
		
		AccessSpecifiers1 accessSpecifiers1Obj = new AccessSpecifiers1();
		accessSpecifiers1Obj.displayPrivate();
		accessSpecifiers1Obj.displayProtect();
		accessSpecifiers1Obj.displayDefault();
		
		//PrivateAccessSpecifier is a default class inside same pack
		System.out.println("\nPrivate method can be accessed using a public method in the same class ");
		PrivateAccessSpecifier.name();// no need of object to call the static method
		
		//Pack2
		System.out.println("\nCalling methods in pack2");
		PublicAcessSpecifierPack2 objPack2 = new PublicAcessSpecifierPack2();
		objPack2.displayPublic();
		// no other access only objPack2.publicMethod()
		
		
		
		

	}
	
	private void displayPrivate() {
		System.out.println("\nThis is a private method inside same class and package");
	}
	
	protected void displayProtect() {
		System.out.println("\nI am a protected method in same class and package");
		
	}
	
	void displayDefault() {
		System.out.println("\nI am a default method inside the same class and package");
	}
	

}
