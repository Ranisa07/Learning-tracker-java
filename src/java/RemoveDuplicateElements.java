package java;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,5,5,6,7};
        int i=0;
        for(int j=1;j<arr.length;j++){      // Identify the Unique element
            if(arr[i] != arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
             if(arr[i]==arr[j]){             // replacing by zero
                arr[j]=0;
            }
       }
        for(int val:arr){                  // After remove the duplicate elements in array
            System.out.println(val);
        }
    }
}
