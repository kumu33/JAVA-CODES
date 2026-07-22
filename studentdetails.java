
class student{
    int rollno;
    String name;
    String dept;
    String section;
    int year;
    student(int rollno,String name,String dept,String section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("Roll no:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Dept:"+dept);
        System.out.println("Section:"+section);
        System.out.println("Year:"+year);
        System.out.println();
    }
    
}
public class Main{
    public static void main(String[]args){
        student[] students=new student[3];
        student s1=new student(101,"abi","CSE","A",2);
        students[0]=s1;
        student s2=new student(102,"priya","ECE","B",3);
        students[1]=s2;
        student s3=new student(103,"arun","EEE","c",1);
        students[2]=s3;
        for(int i=0;i<students.length;i++)
        {
            students[i].display();
        
        }
    }
}
