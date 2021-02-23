
public class ConstructorDemo {

	public static void main(String[] args) {
		
		EmpInfo e1 = new EmpInfo();
		EmpInfo emp1=new EmpInfo(27,"Anna");
		EmpInfo emp2=new EmpInfo(29,"Ben");

		
		e1.display(); //zero parametrized
		emp1.display();//parametrized
		emp2.display();

		

	}

}
