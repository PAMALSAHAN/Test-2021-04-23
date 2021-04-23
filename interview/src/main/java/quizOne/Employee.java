package quizOne;

public class Employee {
    private int eCode;
    private String name;
    private double salary;
    private String address;
    private int age;
    private int rating;

    public Employee(int eCode, String name, double salary, String address, int age, int rating) {
        this.eCode = eCode;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.age = age;
        this.rating = rating;
    }

    public int geteCode() {
        return eCode;
    }

    public void seteCode(int eCode) {
        this.eCode = eCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
