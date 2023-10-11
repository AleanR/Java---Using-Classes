/*NAME: Alean Rodriguez
 * DATE: 02/01/2022(Date the program was created/last modified)
 * ASSIGNMENT#3
 * PROGRAM:Assignment3
 * DESCRIPTION: This is the class code that is referred to multiple times in the Main function. It is converted from the UML diagram from step 1.
 */
public class EnrollmentInfo {

	//The following attributes below are declared so that the constructor is able to identify both the data type and name of the given arguments that are given to it.
	
	String Class;
	String Instructor;
	int Credits;
	int Capacity;
	int Enrollment;
	int AvailableSeats;
	double EnrollmentTuition;
	
	
	
	
	//The EnrollmentInfo constructor collects the data from the main function when it is called to. It will use this information in order to determine the Available Seats and the Enrollment Tuition.
	//The constructor also uses the "this." keyword in order to determine what object it is being called to. IE: Class1,2,3,4,5 are theoretically interchangeable with the "this." keyword.
	
	EnrollmentInfo(String Class,String Instructor,int Credits, int Capacity, int Enrollment){
		
		this.Class = Class;
		this.Instructor = Instructor;
		this.Credits = Credits;
		this.Capacity = Capacity;
		this.Enrollment = Enrollment;
		
		//The expression for the Available Seats. Capacity - Enrollment = Available Seats.
		
		this.AvailableSeats = this.Capacity - this.Enrollment;
		
		//The expression for the Enrollment Tuition. Credits * Enrollment * 2500 (The price per credit).
		
		this.EnrollmentTuition = this.Credits * this.Enrollment * 2500;
	}
	
	//This is the method that gets called to in order to sum up the total amount of tuition. In the main function, it is called to add up all the enrollment tuitions by being called by the 5 "class" objects.
	
	public double getTuition(){
		
		return this.EnrollmentTuition;
		
	}
	
	//This method is responsible for outputting the entire table except from the Labels (IE: Class, Instructor,...).It does this by using the string method "format" in which I am able to control the minimum amount of spaces a certain output will contain.
	//To make the output neater, I have decided to make the minimum for each category 20 and made the double for the enrollment tuition to have 2 decimals using the keywords (.2f).
	public void output() {
		
		System.out.println(String.format("%-20s%-20s%-20d%-20d%-20d%-20d%-20.2f",this.Class,this.Instructor,this.Credits,this.Capacity,this.Enrollment,this.AvailableSeats,this.EnrollmentTuition));
		
	}
}
