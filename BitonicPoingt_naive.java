import java.util.Arrays;
import java.util.Scanner;
public class BitonicPoingt_naive{
    static int bitonicpoint(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
          res=Math.max(res,arr[i]);  
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(bitonicpoint(arr));
        sc.close();
        
    }
}