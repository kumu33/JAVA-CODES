public class Main
{
	public static void main(String[] args) {
		String[] name={"abi","ajay","arun","anbu"};
		int [] [] mark={
		    {60,70,80,90,100},
		    {67,76,87,98,89},
		    {98,99,97,96,95},
		    {78,89,88,86,79}
		    
		};
		System.out.println("Name\tTamil\tEnglish\tMaths\tScience\tsocial\tavg");
		for(int i=0;i<name.length;i++)
		{
		    System.out.print(name[i]+"\t");
		    double total=0;
		    for(int j=0;j<mark[i].length;j++)
		    {
		        System.out.print(mark[i][j]+"\t ");
		        total+=mark[i][j];
		    }
		    
		    System.out.println((total/5));
		    System.out.println();
		}
	}
}
