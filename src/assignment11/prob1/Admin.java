package assignment11.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> stdMap = new HashMap<>();
		for (Student student : students) {
			Key key = new Key(student.getFirstName(), student.getLastName());
			stdMap.put(key, student);
		}
		return stdMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		Set<Key> keySet = maps.keySet();
		double totalGPA = 0.0;
		for (Key key : keySet) {
			totalGPA += maps.get(key).getGpa();
		}
		double avgGPA = totalGPA/keySet.size();
		return avgGPA;
}
}
