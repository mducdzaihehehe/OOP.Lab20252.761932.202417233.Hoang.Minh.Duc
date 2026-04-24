package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        String filename = "garbage_input.txt";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

        long start = System.currentTimeMillis();

        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }

        System.out.println(System.currentTimeMillis() - start);
    }
}
