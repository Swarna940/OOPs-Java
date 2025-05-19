public class Employee {
    private String name;
    private float salary;

    public Employee(String name, float salary){
        this.name=name;
        this.salary=salary;
    }
    // getter method
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

    // setter method
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    // instance method
    public void displaYInfo(){
        System.out.println("Employee : "+name);
        System.out.println("Salary : "+salary);
    }


    public static void main(String[] args) {
        Employee e = new Employee("Rahul Yadav", 100000.0f);
        e.displaYInfo();
    }

}
