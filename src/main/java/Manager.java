public class Manager extends Employee{
    Manager(String name, int salary, int dayBirth, int monthBirth, int yearBirth) {
        super(name, salary, dayBirth, monthBirth, yearBirth);


    }
    public static void upSalary(Employee[] employees, int bonus){
        for(Employee emp: employees){
            if(!(emp instanceof Manager)) emp.salary += bonus;
        }
    }
}
