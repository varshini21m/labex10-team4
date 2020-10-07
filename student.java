/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        FileWriter fw=new FileWriter("C:\\Users\\ELCOT\\stduent.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String str[]={"19CSE090-Swathi","19CSE091-viji","19CSE092-Anu","19CSE093-maha"};
        for(String i:str)
        {
            System.out.println("ho");
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        System.out.println("Enter the rollno to retrieve the name of the student:");
        String str1=obj.next();
        int position=0;
        int c=0;
        boolean found=false;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].contains(str1))
            {
                position=i;
                found=true;
                c=str1.length();
                break;
                
            }
        }
        if(found)
        {
            System.out.println(str[position].substring(c+1));
        }
        else
        {
            System.out.println("ROLLNO NOT FOUND");
        }
        
        
    }
    
}

    
    


    
    

