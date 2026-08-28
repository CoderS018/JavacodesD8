import java.util.*;
class Employee {
	String name;
	String department;
	int salary;
	Employee(String name,String department,int salary) {
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public String toString() {
		return name+" - "+department+" - "+salary;
	}
}
public class App9 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name=sc.nextLine();
		System.out.print("Enter department: ");
		String department=sc.nextLine();
		System.out.print("Enter salary: ");
		int salary=sc.nextInt();
		Employee e=new Employee(name,department,salary);
		System.out.println("Employee Details:");
		System.out.println(e);
	}
}   