package java;

import java.util.Scanner;

public class SecondLargestSmallestElement  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sLargest=secondLargest(arr,n);
        int sSmallest=secondSmallest(arr,n);
        System.out.println(sLargest);
        System.out.println(sSmallest);
    }
    public static int secondLargest(int[] arr,int n){
        int largest=arr[0];
        int sLargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }else if(arr[i] < largest && arr[i] >sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
    public static int secondSmallest(int[] arr,int n){
        int smallest=arr[0];
        int sSmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]!=smallest && arr[i]<sSmallest){
                sSmallest=arr[i];
            }
        }
        return sSmallest;
    }
}
