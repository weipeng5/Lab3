import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author weipengwang
 *
 */
public class Aaa {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
/**
 *
 * @param args whatisthis
 */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

    }

}
