package amao.proj.jrvs.scripter.script.executors.effects.folder;

import java.io.File;
import java.util.LinkedList;

public class Delete {

    public Delete(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) folder.delete();
    }

}
