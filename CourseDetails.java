/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coursedetails;

/**
 *
 * @author jprice2027
 */
public class CourseDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
/*Write a class called Course that represents a course 
offered to students. 
It should contain instance data that 
represents the course title (e.g. Computer Science), 
course code (e,g, AP CS A), pointsTotal, and course Instructor’s name. 
Define one Course constructor to accept and initialize all instance data. 
Define a second constructor which accepts course name only.
Include Accessor (getter) and Mutator (setter) methods for all instance data. 
Include a toString method that returns a multi-line description of the course. 

Create a driver class called CourseDetails whose
main method instantiates and updates several Course objects (at least 3).
At least one course should be created using the full object constructor, and one 
that uses the name only creator (but has the rest of it's values set by the setter and 
retrieved by getter methods).
The main method should then print out each course from the toString.*/

        //Creating 3 different courses, 1 and 3 with the full constructor
        Course course1 = new Course("Computer Science", "AP CS A", 100, "Mr. Nelson");
        Course course2 = new Course("Physics"); //calling on the title only constructor
        //using setter method to set the rest of the course's values
        course2.setCourseCode("AP Phys C");
        course2.setPointsTotal(200);
        course2.setInstructorName("Mrs. Rafie");
        Course course3 = new Course("Political Science", "C Poli Sci 1000", 500, "Mr. B");
        
        //print statements to call on toString
        System.out.println(course1);
        System.out.println("\n" + course2);
        System.out.println("\n" + course3);
    }
    
}

class Course{
    //intstantiating variables as private for different elements of a course
    private String title;
    private String courseCode;
    private int pointsTotal;
    private String instructorName;
    
    //constructor to define an instance of a course
    public Course(String inTitle, String inCourse, int inPoints, String inName){
        title = inTitle;
        courseCode = inCourse;
        pointsTotal = inPoints;
        instructorName = inName;
    }
    
    //title only constructor
    public Course(String inTitle){
        title = inTitle;
    }
    
    //getter and setter methods for each of the four variables for a course
    public String getTitle(){
        return title; //allows this variable to be referenced outside of the class
    }
    
    public void setTitle(String newTitle){
        title = newTitle; //allows this variable to be changed in the main method
    }
    
    public String getCourseCode(){
        return courseCode;
    }
    
    public void setCourseCode(String newCode){
        courseCode = newCode;
    }
    
    public int getPointsTotal(){
        return pointsTotal;
    }
    
    public void setPointsTotal(int newTotal){
        pointsTotal = newTotal;
    }
    
    public String getInstructorName(){
        return instructorName;
    }
    
    public void setInstructorName(String newName){
        instructorName = newName;
    }
    
    //toString method to print and organize course data
    public String toString(){
        String titleString = "Course name: " + title;
        String courseString = "Course code: " + courseCode;
        String pointsString = "Total points: " + pointsTotal;
        String instructorString = "Course instructor: " + instructorName;
        return titleString + "\n" + courseString + "\n" + pointsString + "\n" + instructorString;
    }
}
