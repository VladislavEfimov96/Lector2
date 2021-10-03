package lesson1;
public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;
    public Student (String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName=lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    int getScholarship() {
        if (this.averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
