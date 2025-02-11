package src.java.com.arrays;

import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
        for(int val:arr){
        System.out.println(val);
        }
    }
}
