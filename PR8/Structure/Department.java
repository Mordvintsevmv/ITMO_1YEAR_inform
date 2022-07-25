package Structure;

import java.util.ArrayList;
import java.util.Arrays;

public class Department implements StructureUnit {
    private String title;
    private ArrayList<String> employees;

    public Department(){
        this.employees = new ArrayList<>();
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

    public String getInfo(){
        int num = this.employees.size();
        return "Название: " + this.title + "\n Число работников: " + num + "\n  Сотрудники: " + Arrays.toString(this.employees.toArray());
    }
}





