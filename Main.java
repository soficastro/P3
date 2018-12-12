import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Professor> professors = new ArrayList<Professor>();
        ArrayList<Researcher> researchers = new ArrayList<Researcher>();

        //ArrayList<Project> projects = new ArrayList<Project>();

        boolean process;
        process = true;
        Scanner input = new Scanner(System.in);

        while (process) {
            System.out.println("Welcome! How do you like to continue?");
            System.out.println("Press 1 to ADD A COLLABORATOR");
            System.out.println("Press 2 to LOGIN AS ADMIN");
            System.out.println("Press 3 to CONSULT COLLABORATOR OR PROJECT");
            System.out.println("Press 4 to SHOW REPORT");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    //Scanner input2 = new Scanner(System.in);
                    String name, email;
                    System.out.println("Adding new collaborator...");
                    System.out.println("Are you a (1) student, (2) professor, (3) researcher?");
                    int option2 = input.nextInt();
                    if (option2 == 1 || option2 == 2 || option2 == 3) {
                        switch (option2) {
                            case 1:
                                int type;
                                System.out.println("Digit your name:");
                                name = input.nextLine();
                                System.out.println("Digit your email:");
                                email = input.nextLine();
                                System.out.println("Are you (1) an undergrad, (2) a graduate, (3) mastering?");
                                type = input.nextInt();
                                Student newCollab = new Student(name, email, type);
                                students.add(newCollab);
                                break;

                            case 2:
                                System.out.println("Digit your name:");
                                name = input.nextLine();
                                System.out.println("Digit your email:");
                                email = input.nextLine();
                                Professor newCollab2 = new Professor(name, email);
                                professors.add(newCollab2);
                                break;

                            case 3:
                                System.out.println("Digit your name:");
                                name = input.nextLine();
                                System.out.println("Digit your email:");
                                email = input.nextLine();
                                Researcher newCollab3 = new Researcher(name, email);
                                researchers.add(newCollab3);
                                break;
                        }
                    } else {
                        System.out.println("Umm, that's not an option...");
                    }

                    break;
                case 2:
                    //login(students, professors, researchers);
                    System.out.println("Not available right now");
                    break;
                case 3:
                    consult(students, professors, researchers);
                    break;
                case 4:
                    System.out.println("Not available right now");
                    break;
                default:
                    System.out.println("Please choose a valid option, yes?");
            }

            System.out.println("Would you like to exit or continue?");
            System.out.println("Press 0 to exit the application or 1 to continue");
            if (input.nextInt() == 0) {
                process = false;
            }

        }
    }

/* public static void newCollaborator()
    {

    }*/

    public static void consult(ArrayList<Student> students, ArrayList<Professor> professors, ArrayList<Researcher> researchers)
    {
        System.out.println("Consult for a (1) collaborator, (2) project");
        Scanner input = new Scanner(System.in);
        int option;
        boolean found = false;
        option = input.nextInt();
        String email;
        int id;

        if (option == 1) {
            System.out.println("Enter email");
            email = input.nextLine();
            String my_email;

            for (Student i : students) {
                my_email = i.getEmail();
                if (email.equals(my_email)) {
                    i.display();
                    found = true;
                }
            }
            if (!found) {
                for (Professor i : professors) {
                    my_email = i.getEmail();
                    if (email.equals(my_email)) {
                        i.display();
                        found = true;
                    }
                }
            }
            if (!found) {
                for (Researcher i : researchers) {
                    my_email = i.getEmail();
                    if (email.equals(my_email)) {
                        i.display();
                        found = true;
                    }
                }
            }
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found...");
            }
        } else if (option == 2) {
            System.out.println("Enter project's identification");
            id = input.nextInt();
            System.out.println("Not available right now");
        }
    }

    //public login

}
