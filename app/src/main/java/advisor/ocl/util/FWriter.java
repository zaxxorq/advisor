package advisor.ocl.util;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class FWriter {
    public  void writeFile(String path, String content) throws IOException {
        FileOutputStream fos = new FileOutputStream(path, false);
        fos.write(content.getBytes());
        fos.close();
    }
}

