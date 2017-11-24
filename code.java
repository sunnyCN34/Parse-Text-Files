import java.util.*;
import java.util.Scanner;
import java.io.File;
class mycode {
    public static void main(String args[]) {
        int count = 0;
        int count2 = 0;
        double percent = 0;
        try {
            File f1 = new File("test file.txt");
            Scanner s1 = new Scanner(f1);
            while (s1.hasNext()) {
                String word = s1.next();
                if (word.equals("function")) {
                    count++;
                }

            }
            System.out.println("word appears= " + count + " times in first text file");

            File f2 = new File("test file2.txt");
            Scanner s2 = new Scanner(f2);
            while (s2.hasNext()) {
                String word2 = s2.next();
                if (word2.equals("function")) {
                    count2++;
                }
            }
            System.out.println("word appears= " + count2 + " times in second text file");
            System.out.println("count=" + count + " count2=" + count2);

            percent = (count * 100) / count2;

            System.out.println("Percentage of test coverage we have is equal to= " + percent + "%");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}