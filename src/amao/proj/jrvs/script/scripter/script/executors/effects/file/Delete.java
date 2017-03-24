package amao.proj.jrvs.script.scripter.script.executors.effects.file;

import java.io.File;
import java.util.LinkedList;

public class Delete {

    public Delete(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        File file = new File(path);
        if (file.isFile()) file.delete();
    }

}
