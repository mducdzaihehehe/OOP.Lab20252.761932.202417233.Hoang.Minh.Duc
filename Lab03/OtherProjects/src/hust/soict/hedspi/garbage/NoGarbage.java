package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        String filename = "garbage_input.txt";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

        long start = System.currentTimeMillis();

        StringBuffer outputStringBuffer = new StringBuffer();
        for (byte b : inputBytes) {
            outputStringBuffer.append((char) b);
        }

        String outputString = outputStringBuffer.toString();

        System.out.println(System.currentTimeMillis() - start);
    }
}
