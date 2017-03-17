package range.modular.queries;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * Created by alexk on 3/17/17.
 */
public class Generator {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("input0.txt", "UTF-8");
            int n = 10000;
            int q = 10000;
            int max = 10000;
            writer.println(n + " " + q);
            Random random = new Random();

            for (int i = 0; i < n; i++) {
                writer.print(random.nextInt(max + 1) + " ");
            }
            writer.println();
            for (int i = 0; i < q; i++) {
                int right = random.nextInt(max);
                int left = random.nextInt(right + 1);
                int x = random.nextInt(max) + 1;
                int y = random.nextInt(x + 1);
                writer.println(left + " " + right + " " + x + " " + y);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
