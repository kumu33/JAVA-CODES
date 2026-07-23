class mygrandpa{
    void display(){
        System.out.println("mygrandfather is a farmer");
    }
}
class mydaddy extends mygrandpa{
    void show(){
        System.out.println("my father is a driver");
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
        obj.display();
        obj.show();
        obj.show1();
    }
}
