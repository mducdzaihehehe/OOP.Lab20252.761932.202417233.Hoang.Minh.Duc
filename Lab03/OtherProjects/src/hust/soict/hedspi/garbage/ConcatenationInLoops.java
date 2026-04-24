package hust.soict.hedspi.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += i;
        }

        System.out.println("Using + operator: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(i);
        }
        s = sb.toString();

        System.out.println("Using StringBuilder: " + (System.currentTimeMillis() - start));
    }
}
