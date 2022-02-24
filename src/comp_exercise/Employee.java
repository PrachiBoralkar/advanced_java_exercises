package comp_exercise;
/*Create a employee class with name and employeeId . Print the sorted list of employees by name .
*/
public class Employee {
	int id;
	String name;
	Department d;
	Address address;
	public Employee(int id,String name,Department d) {
		this.id = id;
		this.name = name;
		this.d = d;
	}
	
	public Employee(int id,String name,Address add) {
		this.id = id;
		this.name = name;
		this.address = add;
	}
	
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;		
	}
}
