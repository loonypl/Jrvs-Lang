package amao.proj.jrvs.scripter.script.executors.effects.folder;

import java.io.File;
import java.util.LinkedList;

public class Create {

    public Create(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        File folder = new File(path);
        folder.mkdirs();
    }

}
