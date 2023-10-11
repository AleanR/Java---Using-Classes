/*NAME: Alean Rodriguez
 * DATE: 02/01/2022(Date the program was created/last modified)
 * ASSIGNMENT#3
 * PROGRAM:Assignment3
 * DESCRIPTION: This is the program that will calculate and display the missing columns from Assignment 3 example and will include the final enrollment tuition as well.
 *				The program calls the functions/methods from the EnrollmentInfo class multiple times in order to calculate the final chart.
 */
public class Main {
	
	public static void main(String[] args) {
		
		// Below is calling to the EnrollmentInfo class object in which the constructor will calculate the Available Seats and Enrollment Tuition given these values.
		
		EnrollmentInfo class1 = new EnrollmentInfo("COP 3000","Mary Copper",3,25,10);
		
		EnrollmentInfo class2 = new EnrollmentInfo("COP 3010","Sean Williams",4,45,25);
		
		EnrollmentInfo class3 = new EnrollmentInfo("COP 3020","Matthew Johnson",4,50,30);
		
		EnrollmentInfo class4 = new EnrollmentInfo("COP 3030","Jane Brown",5,35,18);
		
		EnrollmentInfo class5 = new EnrollmentInfo("COP 3040","Emily Parker",5,15,8);
		
		//This is the output for the Labels of the "table" that identify the class, instructor, credits, enrollment, available seats, and the enrollment tuition.
		
		System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Class", "Instructor", "Credits", "Capacity", "Enrollment", "Available Seats", "Enrollment Tuition"));
		
		//This calls the the output function which will neatly output the contents of the finished table neatly. Doing it in the 1,2,3,4,5 order allow the information to go row by row.
		
		class1.output();
		
		class2.output();
		
		class3.output();
		
		class4.output();
		
		class5.output();
		
		//The statement below outputs the total final enrollment tuition by calling the getTuition function in the Enrollmentinfo Class. It essentially gathers all the enrollment tuitions and adds them together.
		
		System.out.println("The Total Enrollment Tuition for all classes is "+(class1.getTuition()+class2.getTuition()+class3.getTuition()+class4.getTuition()+class5.getTuition()));
		
	}
}
