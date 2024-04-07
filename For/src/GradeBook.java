import java.util.Scanner;

public class GradeBook {

	private String courseName;
	
	public GradeBook( String name ) {    
		 courseName = name;  
	 }

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void displayMessage(){
		System.out.printf( "Welcome to the grade book for\n%s!\n",getCourseName() );   
		}
	
	public int determineClassAverage() {
		int total = 0;
		int i = 0;
		Scanner entrada = new Scanner (System.in);
		for(i=0;i<10;i++) {			
			System.out.println("Enter grade:");
			int nota = entrada.nextInt();
			total = total+nota;		
		}
		entrada.close();
		total = total/10;
        
        	
		return total;

	}
}