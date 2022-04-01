                 //constructors
/*package crashcourse;

public class Student {
	String Student_name;
	int rollNo;
		//i)Example for default constractor.
	//Do you see any constructor here? then you have no special power.compiler has created one here!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(student.Student_name);
		System.out.println(student.rollNo);
	}
}*/
/*package crashcourse;

public class Employee{
	int employeeId;
	String employeeName;
	//ii) for No argument constractor.*Employee()-->no argument will be provided.*
  Employee(){
	employeeId=1;
	employeeName="karthi";
	System.out.println("Employee object is created");
}
	public static void main(String[] args) {
		Employee employee=new Employee();
}	
}*/
/*package crashcourse;
//iii)parameterized constructor(it has arguments(parameter))
public class Animal {
	String animal_name;
	String animal_type;
	Animal(String name, String type){
		 animal_name=name;
		 animal_type=type;
	}
	public void sayAboutAnimal() {
	System.out.println("Animal name is "+animal_name + "Animal type is"+animal_type); 
	}
	public static void main(String[] args) {
		Animal animal1 = new Animal("Duck", "Omnivores");
		animal1.sayAboutAnimal();
		Animal animal2 = new Animal("karadi", "Omnivores");
		animal2.sayAboutAnimal();
	}
}*/
package crashcourse;
//Overloadi ng constructor
public class Draw {
	String draw;
	Draw(){
		System.out.println("Draw object is created");
	}
	Draw(String animal){
		 draw=animal;
		 System.out.println("Drawing" +animal);
	}
	
	public static void main(String[] args) {
		Draw draw = new Draw();
		Draw draw1 = new Draw("circle");

		
	}
}