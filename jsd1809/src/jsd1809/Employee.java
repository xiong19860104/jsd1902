package jsd1809;

public class Employee extends Role{
	private double salary;
	public  static int id;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(){
		super();
		
	}
	public Employee(double salary){
		this();
		this.salary=salary;
	}
	@Override
	public void play() {
		System.out.println("Íæ....");
		
	}
	final void sing(){}
}
