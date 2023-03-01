package constructor;

public class ParameterizedConstructor {
	int empId;
	String empName;
	
	ParameterizedConstructor(int id,String name){
		this.empId = id;
		this.empName= name;
		
	}
	void info() {
		System.out.println("Id: "+empId+" Name: "+ empName);
	}
	public static void main(String args[]) {
	ParameterizedConstructor obj1 = new ParameterizedConstructor(1000,"Aparna");
	ParameterizedConstructor obj2 = new ParameterizedConstructor(2000,"Deepa");
	obj1.info();
	obj2.info();
	}

}
