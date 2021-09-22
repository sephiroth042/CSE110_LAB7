/*-------------------------------------------------------------
// AUTHOR: MORRIS, CHRIS    
// FILENAME: Lab7.java
// SPECIFICATION: Classes-Autograder
// FOR: CSE 110- Lab #7
// TIME SPENT: 5hrs 20mins
//-----------------------------------------------------------*/

public class Student {
    private String firstName, lastName, fullName, asuId;
    double grade;

    public Student(String firstName, String lastName, String asuId, double sGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = String.format("%s %s", firstName, lastName);
        this.asuId = asuId;
        this.grade = -1.00;
    }
    public String toString() {
        return String.format("Student: %s, ASUID: %s, Grade: %s",
                fullName, asuId, Double.toString(grade));
    }

    public void setGrade(double newGrade){
        this.grade = newGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAsuID() {
        return asuId;
    }

    public double getGrade(){
        return grade;
    }

}