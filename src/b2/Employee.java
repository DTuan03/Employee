package b2;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String departemnt;
	private String code;
	private String salaryRate;

	public Employee(int id, String name, int age, String departemnt, String code, String salaryRate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.departemnt = departemnt;
		this.code = code;
		this.salaryRate = salaryRate;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartemnt() {
		return departemnt;
	}

	public void setDepartemnt(String departemnt) {
		this.departemnt = departemnt;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(String salaryRate) {
		this.salaryRate = salaryRate;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", name: " + name + ", age: " + age + ", departemnt: " + departemnt + ", code: " + code
				+ ", salaryRate: " + salaryRate;
	}

	public static Employee addEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập mã nhân vien: ");
		int id = scanner.nextInt();

		scanner.nextLine();
		System.out.print("Nhập tên nhân viên: ");
		String name = scanner.nextLine();

		System.out.print("Nhập tuổi: ");
		int age = scanner.nextInt();

		scanner.nextLine();
		System.out.print("Nhập phòng ban: ");
		String department = scanner.nextLine();

		System.out.print("Nhập code: ");
		String code = scanner.nextLine();

		System.out.print("Nhập lương: ");
		String salary = scanner.nextLine();

		Employee emp = new Employee(id, name, age, department, code, salary);

		return emp;
	}
	
	public static void deleteEmployee(ArrayList<Employee> employees, int id) {
		for(Employee emp : employees) {
			if(emp.getId() == id) {
				employees.remove(emp);
				return;
			}
		}
	}
}
