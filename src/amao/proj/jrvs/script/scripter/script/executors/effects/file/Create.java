package amao.proj.jrvs.script.scripter.script.executors.effects.file;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Create {

    public Create(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        File file = new File(path);
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
