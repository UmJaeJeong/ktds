package ex03.test01;

public class Student {
	
	String name;
	int korean;
	int english;
	int math;
	int science;
	
	public Student() {}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
	public double getAvg() {
		int sum = korean+ math+ english + science;
		double avg = sum / (double)4;
		return avg;
	}
	
	public String getGrade() {
		double avg = getAvg();
		String grade = "";
		//평균 점수 100이하 90 A
		if(avg<=100 && avg>=90) {
			grade = "A";
		}else if(avg>=70) {
			grade = "B";
		}else if(avg>=50) {
			grade = "C";
		}else if(avg>=30) {
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	}
	
	
	


}
