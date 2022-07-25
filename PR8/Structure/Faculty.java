package Structure;

import java.util.ArrayList;
import java.util.Arrays;

public class Faculty implements StructureUnit {
    String title;
    private ArrayList<Department> departments;
    private ArrayList<String> employees;

    public Faculty(){
        this.employees = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void hireEmployee(String name){
        this.employees.add(name);
    }

    public void fireEmployee(String name){
        this.employees.remove(name);
    }

    public void addDepartment(Department department){
        this.departments.add(department);
    }

    public String getInfo(){
        int num = this.employees.size();
        String info = "Название: " + this.title + "\n Число работников: " + num + "\n  Работники: " + Arrays.toString(this.employees.toArray());
        info += "\n\nИз департаментов: \n";
        for (Department d: departments){
            info += d.getInfo() + "\n";
        }
        return info;
    }
}