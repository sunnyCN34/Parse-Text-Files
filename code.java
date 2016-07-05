import java.util.*;
import java.util.Scanner;
import java.io.File;
class mycode
{
 public static void main(String args[])
  {
 int count=0; int count2=0;
  try
   {
  File f1= new File("test file.txt");
  Scanner s1=new Scanner(f1);
    while(s1.hasNext())
     {
    String word=s1.next();
       if(word.equals("kite"))
          {
           count++;
          }

     }
System.out.println("word appears= "+count+" times in text file");
    } 
   catch(Exception e)
    {
   System.out.println(e);
    }
  }
}