import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
       int[] newarr = new int[a.length];
       int count = 0;
        for (int x=a.length-1; x>=0 ; x--) {
            newarr[count] = a[x];
            count++;
        }
        return newarr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arrCount = Integer.parseInt(scanner.nextLine());
        String[] arrItems = scanner.nextLine().split(" ");

        int[] arr = new int[arrCount];
//        System.out.println(arr.length);
        scanner.skip("");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        printArray(res);
        scanner.close();
    }

    private static void printArray(int[] res) {
        String output = null;
        for (int i = 0; i < res.length; i++) {
            output.concat(" "+res[i]);
        }
        System.out.println(output);
    }
}
