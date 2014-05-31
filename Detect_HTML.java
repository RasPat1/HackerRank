import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.regex.*;
import java.util.Iterator;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Detect_HTML {
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();

   public static void main(String[] args) throws NumberFormatException, IOException {
      int lineCount = Integer.parseInt(in.readLine());

      TreeSet<String> results = new TreeSet<String>(); 
      for(int i = 0; i < lineCount; i++) {

         parse(in.readLine(), results);

      }
      Iterator iter = results.iterator();
      while(iter.hasNext()) {
         System.out.print(iter.next());
         if(iter.hasNext()) {
            System.out.print(";");
         }
      }
   }

   public static void parse(String line, TreeSet<String> results) {
      Pattern p = Pattern.compile("<\\s?([a-zA-Z]+)\\b?[^>]*>");
      Matcher m = p.matcher(line);
      while(m.find()) {
         results.add(m.group(1));
      }

   }
}
