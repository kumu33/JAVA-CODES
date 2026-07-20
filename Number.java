import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int[] marks={70,80,90,60,80};
	int num=Sc.nextInt();
	for(int i=0;i<marks.length;i++)
	{
	    if(marks[i]==num)
	    {
	        System.out.print("number found");
	        return;
	    }
	}
	System.out.println("number not found");
	}
}
