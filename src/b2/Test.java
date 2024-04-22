package b2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Nam", 21, "CNTT", "Java", "Bac 1"));
		employees.add(new Employee(2, "Nga", 22, "CNTT", "Java", "Bac 2"));
		employees.add(new Employee(3, "Hung", 21, "CNTT", "Java", "Bac 2"));
		employees.add(new Employee(4, "Ha", 21, "CNTT", "C++", "Bac 2"));
		employees.add(new Employee(5, "Manh", 21, "CNTT", "C#", "Bac 2"));
		employees.add(new Employee(6, "Nam", 23, "CNTT", "Python", "Bac 3"));
		employees.add(new Employee(7, "Dat", 24, "CNTT", "Java", "Bac 2"));
		employees.add(new Employee(8, "Nguyet", 21, "CNTT", "Java", "Bac 1"));
		employees.add(new Employee(9, "Nga", 25, "CNTT", "Kotlin", "Bac 2"));
		employees.add(new Employee(10, "Yen", 22, "CNTT", "Java", "Bac 4"));

		System.out.println(
				"Chuc nang: \n1.Hien thi danh sach nhan vien\n2.Them nhan vien\n3.Xoa nhan vien\n4.Thoat chuong trinh");
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.print("Nhap lua chon: ");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					for (Employee emp : employees) {
						System.out.println(emp);
					}
					break;
				case 2:
					employees.add(Employee.addEmployee());
					break;
				case 3:
					System.out.print("Nhap ma nhan vien muon xoa: ");
					int i = scanner.nextInt();
					Employee.deleteEmployee(employees, i);
					break;
				case 4:
					run = false;
			}
		}

	}
}
