package amao.proj.jrvs.script.scripter.script.responders.exprs.folder;

import java.io.File;
import java.util.LinkedList;

public class FoldersOf {

    public static Object run(LinkedList<Object> objs) {
        File dir = new File((String) objs.get(0));
        if (dir.isDirectory()) {
            String ret = "";
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    ret = ret + file.getName() + ", ";
                }
                return ret;
            } else return null;
        } else return null;
    }

}
