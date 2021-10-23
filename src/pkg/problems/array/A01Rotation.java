package pkg.problems.array;
import java.util.ArrayList;
import java.util.Arrays;

public class A01Rotation {
    public static void leftSingleRotate(int[] arr, int n) {
        int firstElement = arr[0];
        for (int i=0; i<n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstElement;
    }

    public static void rightSingleRotate(int[] arr, int n) {
        int lastElement = arr[n-1];
        for(int i=n-1; i>0; i--)
            arr[i] = arr[i-1];
        arr[0] = lastElement;
    }

    public static void leftRotateMOne(int[] arr, int place) {
        for (int i=0; i<place; i++)
            leftSingleRotate(arr, arr.length);
    }

    public static void rightRotateMOne(int[] arr, int place) {
        for (int i=0; i<place; i++)
            rightSingleRotate(arr, arr.length);
    }

    public static void leftRotateMTwo(int[] arr, int place) {
        var aList = new ArrayList<Integer>();
        for (int i=place; i<arr.length; i++)
            aList.add(arr[i]);
        for(int i=0; i<place; i++)
            aList.add(arr[i]);
        System.out.println(aList);
    }

    public static void rightRotateMTwo(int[] arr, int place) {
        var aList = new ArrayList<Integer>();
        for(int i=arr.length-place; i<arr.length; i++)
            aList.add(arr[i]);
        for (int i=0; i<arr.length-place; i++)
            aList.add(arr[i]);
        System.out.println(aList);
    }

    public static void printArray(int[] arr) {
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        leftRotateMOne(arr, 2);
//        printArray(arr);
//        rightRotateMOne(arr, 2);
//        printArray(arr);
        // leftRotateMTwo(arr, 2);
        rightRotateMTwo(arr, 2);
    }
}
