import java.io.*;
import java.util.*;

public class MapHistogram{
   public static void main(String[] args) throws Exception {
      ArrayList<String> al = new ArrayList<String>();
      for(int i = 97; i < 123; i++){
         char letter = (char)(i);
         al.add(letter + "");
      }

      Scanner file = new Scanner(new File("Marienbad.txt"));
      Map<String,Integer> histo = new TreeMap<>();
      int count = 0;
      
      while(file.hasNextLine()){
         String line = file.nextLine();
         line = line.toLowerCase();
         for(int i = 0; i<line.length(); i++){
            String letter = line.substring(i,i+1);
            
            if(al.contains(letter)){
            
               count++;
            }
         }
      }
      
      System.out.println(count);
      
     //  while(file.hasNextLine()){
//          String line = file.nextLine();
//          line = line.toLowerCase();
//          
//          for(char c : line.toCharArray()){
//             if(Character.isLetter(c)){
//                if(histo.containsKey(c+"")){
//                   int val = histo.get(c + "");
//                   val++;
//                   histo.put(c+"", val);
//                } else {
//                   histo.put(c+"", 1);
//                }
//             } 
//          } 
//       }
      
      //System.out.println(histo);
      
      // Map<Integer, String> reverse = new TreeMap<>();
//       int total = 0; 
//       for(String s : histo.keySet()){
//          reverse.put(histo.get(s), s);
//          total += histo.get(s);
//       }
//       System.out.println(reverse);
//       System.out.println(total);
   }
}