package TypeCasting;

class Employee {
	 String name;
	 int salary;

	// Constructor
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void getSalary() {
		System.out.println(name + "'s salary is " + salary + " per month.");
	}

	public void roleInfo() {
		System.out.println(name + " performs general activities.");
	}
}

class Manager extends Employee {
	int teamSize;

	public Manager(String name, int salary, int teamSize) {
		super(name, salary);
		this.teamSize = teamSize;
	}

	@Override
	// Overriding method of super class
	public void roleInfo() {
		System.out.println(name + " manages a team of " + teamSize + " members.");
	}

	public void assignProjects() {
		System.out.println(name + " assign projects for the team.");
	}
}

class Developer extends Employee {
	String language;
	String team;
	String projectName;

	public Developer(String name, int salary, String language, String team, String projectName) {
		super(name, salary); // Inherit the constructor from super class!
		this.language = language;
		this.team = team;
		this.projectName = projectName;
	}

	// Overloading method of super class!
	public void roleInfo(int years) {
		System.out.println(name + " works on the project " + projectName + " with the " + team + " team for almost "
				+ years + " years");
	}

	public void techStack() {
		System.out.println(name + " specializes in " + language + " development.");
	}
}

public class ClassTypecasting {

	public static void main(String[] args) {

		Employee emp1 = new Manager("Arun", 95000, 10);
		emp1.getSalary();
		emp1.roleInfo();

		Manager manager = (Manager) emp1;
		manager.assignProjects();

		Employee emp2 = new Developer("Rohan", 75000, "Java", "Backend", "E-commerce Platform");
		emp2.getSalary();
		emp2.roleInfo(); // access role info method in super class as the reference type is employee
							// super class. To access the method of developer class, we need to downcast to
							// developer to access method in developer class.

		Developer dev = (Developer) emp2;
		dev.techStack();
		dev.roleInfo(2);
	}
}
