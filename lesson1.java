package lesson1;

public class lesson1 {
    public static void main (String args[]) {
        Student student = new Student("Kirill", "Orlov", "BAP2051", 4.90);
        Aspirant aspirant = new Aspirant("Anastasia", "Kraynova", "BAP1752", 5.0 , "work");
        Student[] students = {student, aspirant};
        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
