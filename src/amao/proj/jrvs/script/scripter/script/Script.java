package amao.proj.jrvs.script.scripter.script;

import java.io.File;

public class Script {

    protected String scriptPath;

    public Script(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    public File get() {
        return new File(this.scriptPath);
    }

}
