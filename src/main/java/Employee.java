public class Employee {
    String name;
    int dayBirth;
    int monthBirth;
    int yearBirth;
    int salary;
    Employee(String name, int salary, int dayBirth, int monthBirth, int yearBirth){
        this.name = name;
        this.salary = salary;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
    }

    public Integer compare(Employee emp){
        Integer currentEmp = this.dayBirth + this.monthBirth + this.yearBirth;
        Integer otherEmp = emp.dayBirth + emp.monthBirth + emp.yearBirth;

        return currentEmp - otherEmp;
    }

}
