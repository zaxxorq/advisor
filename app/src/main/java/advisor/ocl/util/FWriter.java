package advisor.ocl.util;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class FWriter {

    Context context;

    public FWriter(Context context){
        this.context = context;
    }

    public void writeLocalFile(String path, String content) throws  IOException
    {
        String localPath = context.getFilesDir() + path;
        writeFile(localPath, content);
    }

    private  void writeFile(String path, String content) throws IOException {
        FileOutputStream fos = new FileOutputStream( path, false);
        fos.write(content.getBytes());
        fos.flush();
        fos.close();
    }
}

