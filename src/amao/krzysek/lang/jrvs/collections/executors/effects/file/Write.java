package amao.krzysek.lang.jrvs.collections.executors.effects.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Write {

    public Write(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        String write = (String) objs.get(1);
        File file = new File(path);
        if (file.exists()) {
            FileWriter writer = null;
            try {
                writer = new FileWriter(file);
                writer.write(write);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
