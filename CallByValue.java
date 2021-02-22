
 	public class CallByValue {
 		int val = 150;
	
	int operation(int val) {
		
		val = val *10/100;
		return val;
		
	}

 	public static void main(String[] args) {
		
 		CallByValue obj1 = new CallByValue();
 		System.out.println("Before operation the value of data is "+obj1.val);
 		obj1.operation(100);
 		System.out.println("After operation the value of data is " + obj1.operation(obj1.val));

	}

}
