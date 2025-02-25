package java;

public class MissingAndDuplicate {
    public static void findUsingVisitedArray(int[] nums) {
        int n = nums.length;
        int[] visited = new int[n + 1];
        int duplicate = -1, missing = -1;

        // Mark visited numbers
        for (int num : nums) {
            visited[num]++;
        }

        // Check for duplicate and missing numbers
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                missing = i;
            } else if (visited[i] > 1) {
                duplicate = i;
            }
        }

        System.out.println("Duplicate: " + duplicate);
        System.out.println("Missing: " + missing);
    }

    public static void findUsingXOR(int[] nums) {
        int xor = 0;

        // XOR all elements in the array
        for (int i=0;i<nums.length;i++) {
            xor ^= nums[i];
        }

        // XOR all numbers from 1 to no.s of elements in array
        for (int i = 1; i <= nums.length; i++) {
            xor ^= i;
        }

        // Find the rightmost set bit
        int rightmostSetBit = xor & -xor;           
        // Divide numbers into two groups and XOR them
        int missingOrDuplicate1 = 0, missingOrDuplicate2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
            missingOrDuplicate1= missingOrDuplicate1 ^ num;
            } else {
                missingOrDuplicate2 =  missingOrDuplicate2 ^ num;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if ((i & rightmostSetBit) == 0) {
                missingOrDuplicate1 = missingOrDuplicate1 ^ i;
            } else {
                missingOrDuplicate2 = missingOrDuplicate2 ^ i;
            }
        }

        // Determine which is missing and which is duplicate
        for (int num : nums) {
            if (num == missingOrDuplicate1) {
            System.out.println("Duplicate: " + missingOrDuplicate1);
            System.out.println("Missing: " + missingOrDuplicate2);
                break;
            }else if(num==missingOrDuplicate2){
            System.out.println("Duplicate: " + missingOrDuplicate2);
            System.out.println("Missing: " + missingOrDuplicate1);
            break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        findUsingVisitedArray(nums);
        findUsingXOR(nums);
    }
}
