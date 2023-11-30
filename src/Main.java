import com.workintech.models.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Kerem","Karaman"));
        employees.add(new Employee(1,"Kerem","Karaman"));
        employees.add(new Employee(2,"joe","doe"));
        employees.add(new Employee(2,"king","kingsman"));
        employees.add(new Employee(3,"queen","kingsman"));
        employees.add(new Employee(3,"queen2","queen2"));
        employees.add(new Employee(4,"ali","cs"));
        employees.add(new Employee(5,"mac","cs-"));

        Map<Integer,Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator<Employee>iterator=employees.iterator();
        while (iterator.hasNext()){
            Employee employee =iterator.next();
            if(employee==null){
                System.out.println("There is null data");
                continue;
            }if (employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            }else {
                employeeMap.put(employee.getId(),employee);
            }
        }
        System.out.println("mevcut:");
        System.out.println(employees);
        System.out.println("tekiller: ");
        System.out.println(employeeMap);
        System.out.println("silinenler: ");
        System.out.println(removedEmployees);

    }
}