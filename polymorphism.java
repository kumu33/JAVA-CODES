class college{
    void department(){
        System.out.println("Welcome to Excel Engineering college");
    }
}
class CSE extends college{
    @Override
    void department(){
        System.out.println("Welcome to computer science department");
    }
}
class ECE extends college{
    @Override
    void department(){
        System.out.println("welcome to Electronics and communication engineering");
    }
}
class AIDS extends college{
    @Override
    void department(){
        System.out.println("Welcome to artificial inteligence and data science");
    }
}
public class Main{
    public static void main(String[]args){
        college c=new CSE();
        c.department();
        college d=new ECE();
        d.department();
        college e=new AIDS();
        e.department();
    }
}
