import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Staff> employees= new ArrayList<>() {
        };
        Employee e1=new Employee(1, "thuong",2.0);
        Employee e2=new Employee(2, "thuong",5.0);
        Manager m1= new Manager(3, "cute",3.0);
employees.add(e1);
employees.add(e2);
employees.add(m1);
Collections.sort(employees, new Comparator<Staff>() {
    @Override
    public int compare(Staff o1, Staff o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
});

        for (Staff e: employees
             ) {
            System.out.println(e.toString());
        }
    }
}
