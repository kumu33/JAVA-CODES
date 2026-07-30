import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		System.out.print("Enter the Marks");
		int mark = Sc.nextInt();
		if(mark>95)
		{
		    System.out.println("grade A");
		}
		else if(mark>=75)
		{
		    System.out.println("grade B");
		}
		else if(mark>=50)
		{
		    System.out.println("grade C");
		}
		else{
		    System.out.println("reappear");
		}
	}
}
