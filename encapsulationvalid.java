class Employee{
    private double Salary;
    public void SetSalary(double Salary){
        if(Salary>=0){
            this.Salary=Salary;
        }
        else{
            System.out.println("Invalid Salary");
        }
    }
    public double getSalary(){
        return Salary;
    }
}
public class Main{
    public static void main(String[]args){
        Employee e=new Employee();
        e.SetSalary(50000);
        System.out.println(e.getSalary());
        e.SetSalary(-1000);
    }
}
