package src.java.com.arrays;

import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);     //User input array length and elements
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    
        int i=0;                     // Starting point of array index
        int nz=0;                    // Next Zero incdex
        int nt=n-1;                  // Next Two index
        while(i<=nt){
           if (arr[i]==0) {          //Sorted 0s in left side of array
            int temp=arr[nz];
            arr[nz]=arr[i];
            arr[i]=temp;
            i++;
            nz++;    
           }else if(arr[i]==2){      //Sorted 2s in right side of array
            int temp=arr[nt];
            arr[nt]=arr[i];
            arr[i]=temp;
            nt--;
           }else{
            i++;
           }
        }
        for(int val:arr){            // Sorted array display
            System.out.println(val);
        }
    }
}
