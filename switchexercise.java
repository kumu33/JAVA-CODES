import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner Sc =new Scanner(System.in);
	    System.out.print("enter the value(1-4):");
	    int value=Sc.nextInt();
	    switch(value)
	    {
	        case 1:
	            System.out.println("appliance:fan");
	            System.out.println("unit consumed:1");
	            System.out.println("cost per unit:8");
	           System.out.println("Electricity Bill="+1*8);
	            break;
	             case 2:
	            System.out.println("appliance:television");
	            System.out.println("unit consumed:2");
	            System.out.println("cost per unit:8");
	             System.out.println("Electricity Bill="+2*8);
	            break; 
	            case 3:
	            System.out.println("appliance:Air conditioner");
	            System.out.println("unit consumed:5");
	            System.out.println("cost per unit:8");
	             System.out.println("Electricity Bill="+5*8);
	            break;
	            case 4:
	            System.out.println("appliance:Refrigerrator");
	            System.out.println("unit consumed:3");
	            System.out.println("cost per unit:8");
	             System.out.println("Electricity Bill="+3*8);
	            break;
	            default:
	            System.out.println("invalid choice");
	    }
	}
}
