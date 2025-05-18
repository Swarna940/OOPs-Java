public class MainClass {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Yuvraj Singh";
        p1.age=21;

        Person p2=new Person();
        p2.name="Rahul Yadav";
        p2.age=20;
        
        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);

        p1.eat();
        p2.walk();
        p2.walk(3);
    }   
}
class Person{
    String name;
    int age;

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps+" steps");
    }
}
