import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in a array:");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the"+(i+1)+"Element:");
            arr[i]=Sc.nextInt();
        }
        System.out.println("odd elements are:");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            
{
    System.out.print(arr[i]+" ");
}        }
        }
    }
