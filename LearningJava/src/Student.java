/**
 *
 * A student, is a Person with an id number and
 * a grade point average
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry January 20, 2006
 *
 */

public class Student extends Person{
  private String myIdNum;    // Student Id Number
  private double myGPA;      // grade point average

  // constructor
  public Student(String name, int age, String gender,
                 String idNum, double gpa){
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }

  public String getIdNum(){
    return myIdNum;
  }

  public double getGPA(){
    return myGPA;
  }

  public void setIdNum(String idNum){
    myIdNum = idNum;
  }

  public void setGPA(double gpa){
    myGPA = gpa;
  }

  public String toString(){
    return super.toString() +
           ", student id: " + myIdNum + ", gpa: " + myGPA;
  }
}
