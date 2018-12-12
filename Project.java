import java.util.ArrayList;

public class Project
{
    String title;
    int startDay, startMonth, startYear;
    int endDay, endMonth, endYear;
    String agency;
    int value;
    String goal;
    String description;
    int id;
    //Participants
    ArrayList<Professor> projects_professors;
    ArrayList<Student> projects_students;
    ArrayList<Researcher> projects_researchers;
    //Status -> 1 = Implementing, 2 = In process, 3 = Concluded
    int status;



}
