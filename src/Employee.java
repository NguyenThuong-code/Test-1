public class Employee extends Staff{

    public Employee() {
    }

    public Employee(int id, String name) {
        super(id, name);
    }

    public Employee(int id, String name, Double salary) {
        super(id, name, salary);
    }


    @Override
    public Double calSalary() {
        return getSalary()*2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" +calSalary() +
                '}';
    }
}
