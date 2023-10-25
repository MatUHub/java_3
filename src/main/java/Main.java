public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("emp1", 100, 1, 5, 2000);
        Employee emp2 = new Employee("emp2", 90, 5, 10, 2005);
        Employee emp3 = new Employee("emp3", 110, 10, 1, 2007);
        Employee emp4 = new Employee("emp4", 80, 15, 4, 2003);
        Employee emp5 = new Employee("emp5", 150, 20, 8, 2000);
        Manager man = new Manager("man", 200, 25, 12, 1995);
        Employee[] employees = {emp1, emp2, emp3, man, emp4, emp5};
        System.out.println("Зарплата сотрудника до повышения");
        System.out.println();
        for (Employee emp : employees) {
            System.out.println("Зарплата сотрудника " + emp.name + " равна " + emp.salary);
        }
        Manager.upSalary(employees, 50);
        System.out.println();
        System.out.println("Зарплата сотрудника после повышения");
        System.out.println();
        for (Employee emp : employees) {
            System.out.println("Зарплата сотрудника " + emp.name + " равна " + emp.salary);
        }
        System.out.println(emp1.compare(emp2));
        System.out.println(emp5.compare(emp4));
        System.out.println(emp3.compare(emp1));

    }
}

