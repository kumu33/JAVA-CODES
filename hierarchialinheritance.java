class mydaddy{
    void display(){
        System.out.println("my father is a farmer");
    }
}
class mybrother extends mydaddy{
    void show(){
        System.out.println("my brother is a police");
    }
}
class me extends mydaddy{
    void show1(){
        System.out.println("i am a student");
    }
}
public class Main{
    public static void main(String[]args){
        me obj=new me();
        obj.show1();
        mybrother bro=new mybrother();
        bro.show();
        bro.display();
    }
}
