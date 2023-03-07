public class Student extends Person{
    protected String myIdNum; // student ID number
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa)  // Main Constructor
    { 
        super(name,age,gender); // call the constructor of the superclass
        myIdNum = idNum;
        myGPA = gpa;
    }
    
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }

}
