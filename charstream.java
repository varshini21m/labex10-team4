/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;


import java.io.FileReader;
import java.io.FileWriter;
public class charstream {

   
    public static void main(String[] args) throws Exception{ 
      FileReader re = null;
      FileWriter wr = null;

      try {
         re = new FileReader("C:\\Users\\ELCOT\\Desktop\\input.txt");
         wr = new FileWriter("C:\\Users\\ELCOT\\Desktop\\output.txt");
         
         int c;
         while ((c = re.read()) != -1) {
            wr.write(c);
         }
      }finally {
         if (re != null) {
            re.close();
         }
         if (wr != null) {
            wr.close();
         }
      }
   }
}


            
        



      

