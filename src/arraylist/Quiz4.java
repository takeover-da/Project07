//package arraylist;
//
//import java.util.ArrayList;
//
//public class Quiz4 {
//
//	public static void main(String[] args) {
//			ArrayList<Student> list = new ArrauList<Student>();
//			list.add(new Student(1001,"둘리"));
//			list.add(new Student(1002,"또치"));
//			list.add(new Student(1003,"도우너"));
//			
//			Student student1 = list.get(0);
//			student1.showInfo();
//			Student student2 = list.get(1);
//			student1.showInfo();
//			Student student3 = list.get(2);
//			student1.showInfo();
//			
//		}
//		
//	}
//
//}
//
//// 학생 클래스
//class Student {
//	int studentID;		// 학번
//	String studentName; // 이름
//	
//	public Student(int studentID, String studentName) {
//		super();
//		this.studentID = studentID;
//		this.studentName = studentName;
//	}
//	
//	public void showInfo() {
//		System.out.println(studentID + "," + studentName);
//	}
//}