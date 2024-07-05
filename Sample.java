package Tutorial;
import java.util.Scanner;
public class Sample {
    public static void main(String args[]){
        int arr[];
        arr=new int [5];
        for(int i=0;i<=arr.length-1;i++){
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the "+(i+1)+" element:");
            arr[i]=a.nextInt();
            a.close();
        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
