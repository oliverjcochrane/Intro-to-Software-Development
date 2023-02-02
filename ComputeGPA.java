
/**
 * Write a description of class ComputeGPA here.
 *
 * @author (Oliver Cochrane)
 * @version (1/18/23)
 */
public class ComputeGPA
{
    public static void main(String[] args) {
        //SAVE EACH COURSE CRN
        String course1 = "POSC140";
        String course2 = "SCDV110";
        String course3 = "MATH120";
        String course4 = "FYSM100";
        
        //STORE NUMERIC EQUIVALENTS FOR LETTER GRADE FOR EACH COURSE
        double course1Grade = 4.0;
        double course2Grade = 4.0;
        double course3Grade = 4.0;
        double course4Grade = 4.0;
        
        //STORE THE CREDIT VALUE FOR EACH COURSE
        int course1Credits = 3;
        int course2Credits = 3;
        int course3Credits = 4;
        int course4Credits = 3;
        
        //STORE THE SUM OF CREDITS TAKEN FOR ALL FOUR COURSES
        int totalCreditsTaken = course1Credits+course2Credits+course3Credits+course4Credits;
        
        //COMPUTE GPA
        double finalGPA = ((course1Grade*course1Credits)+(course2Grade*course2Credits)+(course3Grade*course3Credits)+(course4Grade*course4Credits))/totalCreditsTaken;
        
        //PRINT RESULTS TABLE
        System.out.println(course1+"  "+course1Grade);
        System.out.println(course2+"  "+course2Grade);
        System.out.println(course3+"  "+course3Grade);
        System.out.println(course4+"  "+course4Grade);
        System.out.println("Your final GPA for the semester is: "+finalGPA);
        

    }
}
