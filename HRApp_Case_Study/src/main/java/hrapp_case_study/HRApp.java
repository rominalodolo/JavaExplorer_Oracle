package hrapp_case_study;

public class HRApp {
    public static void main(String[]args){
        System.out.println("HR App Starts");

        Employee e1 = new Employee(937, "Romina", 27789);
        Employee e2 = new Employee(780, "Jackie", 69932);


        Department dept = new Department("Education");

        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(429, "Jane", 62874));


        Employee[] emps = dept.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Emp " + emp);
        }

        System.out.println("Total " + dept.getTotalSalary());

//        System.out.println(e1);
//        System.out.println(e2);
    }
}

