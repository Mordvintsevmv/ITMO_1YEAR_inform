package Structure;

public class InterfaceExample{
    public static void main(String[] args){

        Department department = new Department();
        department.setTitle("Депортамент приколов");
        department.hireEmployee("Крутой человек");
        department.hireEmployee("Плохой человек");
        System.out.println(department.getInfo());
        System.out.println();

        Faculty faculty = new Faculty();
        faculty.setTitle("Факультет кушания");
        faculty.addDepartment(department);
        faculty.hireEmployee("Нормальный парень");
        System.out.println(faculty.getInfo());

        System.out.println();
        System.out.println(department.getInfo());
        System.out.println();

    }
}