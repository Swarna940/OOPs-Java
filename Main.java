public class Main {
    public static void main(String[] args) {
        Numbers n=new Numbers();
        n.setA(50);
        n.setB(30);

        n.sum();
        n.sub();
    }
}
class Numbers{
    private int a, b;
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
}
