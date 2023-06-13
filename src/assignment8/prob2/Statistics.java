package assignment8.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> employeeData) {
		double sum = 0.0;
		for (EmployeeData e: employeeData){
			sum+=e.getSalary();
		}
		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
