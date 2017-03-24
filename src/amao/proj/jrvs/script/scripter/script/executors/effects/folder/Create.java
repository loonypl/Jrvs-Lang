package amao.proj.jrvs.script.scripter.script.executors.effects.folder;

import java.io.File;
import java.util.LinkedList;

public class Create {

    public Create(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        File dir = new File(path);
        if (dir.isDirectory()) dir.mkdirs();
    }

}
