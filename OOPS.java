public class OOPS{
    public static void main(String[] args) {
        Pen p=new Pen();
        p.color="black";
        p.type="ballpoint";

        Pen p1=new Pen();
        p1.color="blue";
        p1.type="gel";

        // p.write();
        // p1.printColor();

        Student s=new Student();
        s.name="Swarn Aabha";
        s.age=21;

        s.printInfo();
    }

}

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something!");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
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
