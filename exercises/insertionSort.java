import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class insertionSort {

public static void main(String[] args) throws IOException {

    File file = new File("10_Random");

    try {

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            int i = sc.nextInt();
            System.out.println(i);
        }
        sc.close();
    } 

 }
}