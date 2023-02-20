public class Manager extends Staff{
    public Manager() {
    }

    public Manager(int id, String name) {
        super(id, name);
    }

    public Manager(int id, String name, Double salary) {
        super(id, name, salary);
    }



    @Override
    public Double calSalary() {
        return getSalary()*3;
    }
    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" +calSalary() +
                '}';
    }
}
