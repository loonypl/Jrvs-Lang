package amao.krzysek.lang.jrvs.collections.executors.effects.folder;

import java.io.File;
import java.util.LinkedList;

public class Delete {

    public Delete(LinkedList<Object> objs) {
        String path = (String) objs.get(0);
        File dir = new File(path);
        if (dir.isDirectory() && dir.exists()) dir.delete();
    }

}
