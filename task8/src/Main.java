import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        School mySchool = new School("Baku High", 1998, true, 750);

        mySchool.setDepartments(new String[]{"Math", "Physics", "IT"});

        mySchool.printSchoolInfo();

        mySchool.printDepartments();

        System.out.println("School age: " + mySchool.getSchoolAge(LocalDate.now().getYear()));

        System.out.println("Is Public: " +mySchool.isPublicSchool());

    }
}