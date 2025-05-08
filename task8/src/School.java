public class School {
    public String name;
    private int yearFounded;
    private boolean isPublic;
    int numberOfStudents;
    private String[] departments;

    public School(String _name, int _yearFounded, boolean _isPublic, int _numberOfStudents){
        name = _name;
        yearFounded = _yearFounded;
        isPublic = _isPublic;
        numberOfStudents = _numberOfStudents;
    }
    public void printSchoolInfo(){
        System.out.println(name + " adlı məktəb haqqında ümumi məlumatlar:");
        System.out.println(yearFounded + " ilində əsası qoyulub.");
        if(isPublic){
            System.out.println("Dövlət məktəbidir.");
        } else {
            System.out.println("Özəl məktəbdir.");
        }
        System.out.println("Hal-hazırda məktəbdə " + numberOfStudents + " şagird təhsil alır.");
        printDepartments();
    }

    public void setDepartments(String[] _departments){
        departments = _departments;
    }

    public void printDepartments(){
        System.out.println("Məktəbin tədris şöbələri:");
        for (String department : departments){
            System.out.println(department);
        }
    }

    public int getSchoolAge(int year){
        return year - yearFounded;
    }

    public boolean isPublicSchool(){
        return isPublic;
    }
}
