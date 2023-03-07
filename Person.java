public class Person {
    protected String myName; // protected means that only subclasses can access this variable directly (but not outside the package) 
    //name of the person
    protected int myAge; // persons age
    protected String myGender; // “M” for male, “F” for female

    public Person() {} // default constructor

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

   public String getName() {
        return myName;
   }

   public void setName(String name) {
        myName = name;
   }

   public int getAge() {
        return myAge;
   }

   public void setAge(int age) {
        myAge = age;
   }

   public String getGender() {
        return myGender;
   }

   public void setGender(String gender) {
        myGender = gender;
   }

   public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
}
}
