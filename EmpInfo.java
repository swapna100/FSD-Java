
public class EmpInfo {
	int id;
	String name;
	
	public EmpInfo() {
		
	}
	
	public EmpInfo(int id,String name) {
		this.id = id;
		this.name = name;
		
	}

void display() {
	System.out.println(id+" "+name);
	}


}
