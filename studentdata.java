class Student{
    int rollno;
    String name;
    String dept;
    String section;
    int year;
    Student(int rollno,String name,String dept,String section,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    
    }
    class marks
    {
        int tamil,english,maths,science,social;
        marks(int tamil,int english,int maths,int science,int social){
            this.tamil=tamil;
            this.english=english;
            this.maths=maths;
            this.science=science;
            this.social=social;
        }
        int total(){
            return tamil+english+maths+science+social;
        }
        double average(){
            return total()/5.0;
            
        }
        }
        public class Main{
            public static void main(String[]args){
                Student[] Students=new Student[2];
                marks[] marks=new marks[2];
                Students[0]=new Student(101,"abi","CSE","A",2);
                
                marks[0]=new marks(98,99,97,96,95);
        Students[1]=new Student(102,"priya","ECE","B",3);
        marks[1]=new marks(99,89,88,87,86);
        for(int i=0;i<Students.length;i++)
        {
            System.out.println("Roll NO:"+Students[i].rollno);
            System.out.println("Name:"+Students[i].name);
            System.out.println("Department:"+Students[i].dept);
            System.out.println("Section:"+Students[i].section);
            System.out.println("Year:"+Students[i].year);
            System.out.println("Tamil:"+marks[i].tamil);
            System.out.println("English:"+marks[i].english);
            System.out.println("Maths:"+marks[i].maths);
            System.out.println("Science:"+marks[i].science);
            System.out.println("Social:"+marks[i].social);
            System.out.println("Total:"+marks[i].total());
            System.out.println("Average:"+marks[i].average());
            System.out.println();
        }
        
                
            }
        }
