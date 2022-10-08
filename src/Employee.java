public abstract class Employee {
    private String name;
    private int empCode;
    private String dob;
    private int age;
    private double salary;

    public abstract double calculateIncrement(float payHike);

    public Employee(String name, int empCode, String dob, int age, double salary) {
        this.name = name;
        this.empCode = empCode;
        this.dob = dob;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
