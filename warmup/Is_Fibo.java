import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();

   public static void main(String[] args) throws NumberFormatException, IOException {
      int testCount = Integer.parseInt(in.readLine());
      HashMap<Integer, Long> memo = new HashMap<Integer, Long>(); 
      String result = "";

      memo.put(0, 0L);
      memo.put(1, 1L);
      memo.put(2, 1L);
      for (int i = 0; i < 50; i++) {
         FibGen(i, memo);
      }


      for(int i = 0; i < testCount; i++) {
         Long value = Long.parseLong(in.readLine());
         if (memo.containsValue(value)) {
            result = "IsFibo";
         } else {
            result = "IsNotFibo";
         }

         System.out.println(result);
      }       
   }
   public static Long FibGen(int n, HashMap<Integer, Long> memo) {
      
      if(memo.containsKey(n)) {
         return memo.get(n);
      }

      memo.put(n , FibGen(n-1, memo) + FibGen(n-2, memo));
      return 0L;
   }


}
