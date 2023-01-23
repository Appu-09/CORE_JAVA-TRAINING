package myassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStudent {
	
	public static void main(String [] args) {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(11,"Aparna",20));
		students.add(new Student(12,"Sadhana",23));
		students.add(new Student(13,"SaiSupriya",25));
		students.add(new Student(14,"Bindu",24));
		students.add(new Student(15,"Sabahat",29));
		students.add(new Student(16,"Palak",28));
		students.add(new Student(17,"Adithi",18));
		
		System.out.println("The distinct name of students :" + students.stream().map((student)->{return student.getName();}).collect(Collectors.toSet()));
		
		System.out.println("Students whose age is above 18 : " + students.stream().filter((student)->student.getAge()>18).collect(Collectors.toList()));
		
		Stream<Student> stream = students.stream();
		
		long avgAge =  stream.map(a->a.getAge()).reduce(0,(x,y)-> x+ y)/students.stream().count();
		
		System.out.println("Average age of Students : " + avgAge);
		
		
	}
}
