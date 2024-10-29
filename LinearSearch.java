package DSA;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println("Enter 10 array elements:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");

        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }

        sc.close();
    }
}
