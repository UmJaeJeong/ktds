package ex03.test01;

public class TestStudent {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("Kim",100,90,95,89);
		students[1] = new Student("Lee",60,70,99,98);
		students[2] = new Student("Park",68,86,60,40);
		
		for(Student s : students) {
			System.out.println(s.getName()+" 평균: "+s.getAvg()+" 학점:"+s.getGrade()+"학점");
		}

	}

}
