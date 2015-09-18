package advisor.ocl.util;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import advisor.ocl.main.App;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class FWriter {

    public FWriter(){}

    public  void writeFile(String path, String content) throws IOException {
        FileOutputStream fos = new FileOutputStream( path, false);
        fos.write(content.getBytes());
        fos.flush();
        fos.close();
    }
}

