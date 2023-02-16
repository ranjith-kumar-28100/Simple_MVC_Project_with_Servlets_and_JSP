package inc.codeman.servlet.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents(){
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Ranjith","Kumar","rkg@codeman.inc"));
		studentList.add(new Student("Kirupa","Nithy","kpy@codeman.inc"));
		studentList.add(new Student("Cidharth","Sampath","cs@codeman.inc"));
		return studentList;
	}

}
