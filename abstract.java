abstract class Animal{
    abstract  void sound();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
public class Main{
    public static void main(String[]args){
        dog d=new dog();
        d.sound();
        d.sleep();
    }
}
