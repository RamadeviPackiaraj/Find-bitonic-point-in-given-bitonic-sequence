import java.util.Scanner;
import java.util.Arrays;
public class BitonicPoint_BinarySearch{
    public static int bitonicPoint(int[] arr){
        int n=arr.length;
        //Search space for binary search 
        int low=0,high=n-1;
        int res=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(mid+1<n&&arr[mid]>arr[mid+1]){
                res=mid;
                high=mid-1;
                
            }
            else{
                low =mid+1;
            }
        } 
        return arr[res];
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
        System.out.println(bitonicPoint(arr));
        sc.close();
        
    }
}