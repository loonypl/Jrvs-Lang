package amao.proj.jrvs.scripter.script.executors.effects.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Write {

    public Write(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        String write = (String) objs.get(1);
        if (new File(path).exists()) {
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(path));
                writer.write(write);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (!(writer == null)) {
                        writer.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
