package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private int Id;
	private String Name;
	private Integer Salary;
	public Employee(int id, String name, Integer salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
}
