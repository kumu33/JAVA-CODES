public class Main
{
	public static void main(String[] args) {
	int[] arr={10,20,30,15,40};
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
	    if(arr[i]<min)
	    {
	        min=arr[i];
	}
	}
	System.out.print("minimum Element"+(min));
}
}
