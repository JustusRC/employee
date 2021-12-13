package employee;


import java.util.LinkedList;
import java.util.ListIterator;

public class Downsize {
	
	

	// Justus Contreras
	// 10/12/2021
	// E15.1
	// CS 234 

	public static void downsize(LinkedList<String> employeeNames, int n) {
		//Variable declaration
	    int i=1;
	    //Linklist
	      ListIterator<String> employee=(ListIterator<String>) employeeNames.iterator();
	      //While Loop that goes through the list
	      while(employee.hasNext()){
	          employee.next();
	          //If there is an element remove it
	          if(i%n==0) {
	              employee.remove();
	          }
	          i++;
	      }
	}
	
	
	
	
	public static void print(LinkedList<String> employeeNames) {
		
		
	    //Prints out names
		System.out.println("The content of the Linked List is:");
		
		System.out.println(employeeNames);
	
	}

}
