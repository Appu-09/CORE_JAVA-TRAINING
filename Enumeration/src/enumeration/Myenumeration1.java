package enumeration;

enum Apple{
	Jonathon,GoldenDel,RedDel,Winesap,Cortland
}

public class Myenumeration1 
{
	public static void main(String[] args)
	{
		Apple ap;
		ap = Apple.RedDel;
		//Outputs an enum value
		System.out.println("Value of ap : " + ap);
		System.out.println();
		ap = Apple.GoldenDel;
		//Comparing two enum values
		if(ap==Apple.GoldenDel)
			System.out.println("ap contains GoldenDel.\n");
		//Using an enum to control switch statement
		switch(ap) {
		case Jonathon:
			System.out.println("Jonathon is red");
			break;
		case GoldenDel:
			System.out.println("Golden Delicious is yellow");
			break;
		case RedDel:
			System.out.println("Red Delicious is red");
			break;
		case Winesap:
			System.out.println("Winesap is red");
			break;
		case Cortland:
			System.out.println("Cortland is red");
			break;
		}
	}

}

