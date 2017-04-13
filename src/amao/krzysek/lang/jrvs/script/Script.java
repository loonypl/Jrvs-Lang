package amao.krzysek.lang.jrvs.script;

import java.io.File;

public class Script {

    protected String path;

    public Script(String path) {
        this.path = path;
    }

    public File get() {
        return new File(path);
    }

}
