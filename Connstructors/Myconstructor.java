package constructor;
// Default Constructor
public class Myconstructor {
	String name;
	Myconstructor(){
		this.name = " Aparna";
		
	}
	public static void main (String[] args) {
		Myconstructor obj = new Myconstructor();
		System.out.println(obj.name);
	}

}
