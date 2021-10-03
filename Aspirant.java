package lesson1;
public class Aspirant extends Student{
    public String science;
    public Aspirant (String firstName, String lastName, String group, double averageMark, String science){
        super(firstName,lastName, group, averageMark);
        this.science = science;
    }
    @Override
    int getScholarship(){
        return (this.averageMark==5) ? 200:180;
    }
}


