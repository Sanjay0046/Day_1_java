package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Taskfile {
    public static void main(String[] args) {
  
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter fr = new BufferedWriter(new FileWriter("output.txt"));

            String line;
            int total = 0;
            int i = 0;

            while ((line = br.readLine()) != null) {
                String[] a = line.split(" ");
                String name = a[0];
                int mark = Integer.parseInt(a[1]);

                fr.write(name + "  : " + mark + " \n");
                total = total + mark;
                i = i + 1;
            }

            if (i > 0) {
                double avg = (double) total / i;
                fr.write("Total = " + total + "\n");
                fr.write("Average = " + avg + "\n");
            }

            br.close();
            fr.close();
            System.out.println("done. Check output.txt");

        } catch (Exception e) {
            System.out.println("File is not exist or error: " + e);                                  
        }
    }
}
