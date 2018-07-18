package lesson35;

public class Worker {
    private int id;
    private String name;
    private int salary;

    public Worker() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        double k = 0.5;
        this.salary = (int) (salary + salary*k);
    }
}
