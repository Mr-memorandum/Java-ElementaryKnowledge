package Mr.memorandum.java.foundation;

public class Staff implements Comparable<Staff>{
    private String name;
    private int age;
    private double salary;

    public Staff(String name,int age,double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Staff(String name,int age)
    {
        this.name = name;
        this.age = age;
        this.salary = 0;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public int compareTo(Staff other) {
        return this.age - other.age;
    }
}
