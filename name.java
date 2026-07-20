import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
String[] name={"anbu","aathi","abi"};
String n=Sc.nextLine();
	for(int i=0;i<name.length;i++)
	{
	    if(name[i].equals(n))
	    {
	        System.out.print("name found");
	        return;
	    }
	}
	System.out.println("name not found");
	}
}
