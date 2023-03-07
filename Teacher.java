public class Teacher extends Person{
    protected String Subject; 
    protected double Salary;

    public Teacher(String myName, int myAge, String myGender, String mySubject, double mySalary) {
        super(myName, myAge, myGender);
        this.Subject = mySubject;
        this.Salary = mySalary;
    }

    public String getMySubject() {
        return Subject;
    }

    public void setMySubject(String mySubject) {
        this.Subject = mySubject;
    }

    public double getMySalary() {
        return Salary;
    }

    public void setMySalary(double mySalary) {
        this.Salary = mySalary;
    }

    public String toString() {
        return super.toString() + ", Subject: " + Subject + ", Salary: " + Salary;
    }
}
