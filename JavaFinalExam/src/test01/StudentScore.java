package test01;

public class StudentScore {
	public String studentName;
	public String studentId;
	public String subject;
	public double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;	  	  
	}
	
	 

	public void printStudentInfo() {
		System.out.println("학생이름 :" + studentName);
		System.out.println("학생ID :" + studentId);
		System.out.println("과목명 :" + subject);
		System.out.println("과목 점수 :" + score);
	}
	
	 public void updateScore(double newScore) {
		  
	        this.score = newScore;
	  }
	 
	 public double getScore() {
			return this.score;
		}
	

	}
		
		
			
	

	
