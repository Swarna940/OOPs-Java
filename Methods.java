public class Methods {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Swarn Aabha";
        s.age=21;
        s.printInfo();
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Student() {
        System.out.println("Constructor Called");
    }
}
