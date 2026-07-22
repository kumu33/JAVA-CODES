class library{
    int price;
    String authorname;
    String title;'
    String category;
    int year;
    library(int price,String authorname,String title,String category,int year){
        this.price=price;
        this.authorname=authorname;
        this.title=title;
        this.category=category;
        this.year=year;
    }
    void display(){
        System.out.println("PRICE:"+price);
        System.out.println("Author Name:"+authorname);
        System.out.println("TITLE:"+title);
        System.out.println("CATEGORY:"+category);
        System.out.println("Year:"+year);
        System.out.println();
    }
    
}
public class Main{
    public static void main(String[]args){
        library[] librarys=new library[3];
        library s1=new library(101,"abi","analog electronics","A",2001);
        librarys[0]=s1;
        library s2=new library(102,"priya","digital electronics","B",2002);
        librarys[1]=s2;
        library s3=new library(103,"arun","computer networks","c",2005);
        librarys[2]=s3;
        for(int i=0;i<librarys.length;i++)
        {
            librarys[i].display();
        
        }
    }
}
