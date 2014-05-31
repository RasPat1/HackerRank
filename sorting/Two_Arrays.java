import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Arrays;
import java.util.Collections;

public class Two_Arrays {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for(int i = 0; i < testCases; i++) {
            int arraySize = stdin.nextInt();
            int sum = stdin.nextInt();
            Integer[] a1 = new Integer[arraySize]; 
            Integer[] a2 = new Integer[arraySize];
            for (int j =0; j < arraySize; j++) {
                a1[j] = stdin.nextInt();
            }
            for (int j =0; j < arraySize; j++) {
                a2[j] = stdin.nextInt();                
            }
            Arrays.sort(a1);
            Arrays.sort(a2, Collections.reverseOrder());
            String result = "YES";
            for(int j = 0; j < arraySize; j++) {
                    System.out.println(a1[j]);
                    System.out.println(a2[j]);
                if(a1[j] + a2[j] != sum) {
                    result = "NO";
                    break;
                }
            }
            System.out.println(result);
            
        } 
       
            
    }
}
