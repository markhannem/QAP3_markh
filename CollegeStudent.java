public class CollegeStudent extends Student{
    protected String major;
    protected int year;

    public CollegeStudent(String myName, int myAge, String myGender,String myIdNum, Double myGpa, String major, int year) {
        super(myName, myAge, myGender, myIdNum, myGpa);
        this.major = major;
        this.year = year;
    }

    
}
