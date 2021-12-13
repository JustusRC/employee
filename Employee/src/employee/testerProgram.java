package employee;

import java.util.LinkedList;

public class testerProgram {

	public static void main(String[] args) {

		LinkedList<String>employeeNames= new LinkedList<>();
		
		employeeNames.add("John");
		employeeNames.add("Emma");
		employeeNames.add("Luis");
		employeeNames.add("Carlos");
		employeeNames.add("Karla");
		employeeNames.add("Maria");

		Downsize.downsize(employeeNames, 2);
		Downsize.print(employeeNames);
		System.out.println("Expected: John Luis Karla");
		
		
		
		
		
		
		
		
	}

}
