package hrapp_case_study;

public class Department {

    private String name;

    private Employee[] employees = new Employee[10];

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addEmp (Employee anEmployee) {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmloyeeindex]= anEmployee;
        }
    }

}
