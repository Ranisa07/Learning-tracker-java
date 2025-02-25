package java;

import java.util.*;
public class ReverseInGroups {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverseInGroups(arr, n, k);
    }
    public static void reverseInGroups(int[] arr,int n, int k){
        for(int i=0;i<n;i+=k){
            int start=i;
            int end=Math.min(i+k-1, n-1);   //find minimum index for end point

            //reverse array 
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for(int val:arr){                 // After reverse array in groups by three 
            System.out.println(val);
        }
    }
}
