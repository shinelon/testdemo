package demo.path.jarpath;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
    static {
        System.setProperty("logdir", getPath());
    }
    private static Logger logger = Logger.getLogger("clickLog");

    /**
     * @param args
     */
    public static String getPath() {

        URL url = App.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = null;
        try {
            filePath = URLDecoder.decode(url.getPath(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (filePath.endsWith(".jar")) {

            filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
        }

        File file = new File(filePath);
        filePath = file.getAbsolutePath();//
        return filePath;
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("logdir"));
        logger.debug("debug");
        logger.error("error");

    }
}
