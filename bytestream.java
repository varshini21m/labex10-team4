/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class bytestream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException, IOException{
        FileInputStream fin= null;   
     FileOutputStream fout=null;
        {
        fin= new FileInputStream("C:\\Users\\ELCOT\\Desktop\\byte_inputstream.jpg");
         fout=new FileOutputStream("C:\\Users\\ELCOT\\Desktop\\byte_outputstream.jpg");
         int b;
         while((b=fin.read())!=-1)
         {
             fout.write(b);
         }
         fout.close();
             
         }
             
             
        
    }
    
}
