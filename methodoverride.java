class Animal{
    void sound(){
        System.out.println("Animal make a Sound");
    }
}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meows");
    }
}
public class Main{
    public static void main(String[]args){
        Animal a=new Animal();
        a.sound();
        cat s=new cat();
        s.sound();
    }
}
