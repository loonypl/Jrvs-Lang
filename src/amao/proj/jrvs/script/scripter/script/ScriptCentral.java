package amao.proj.jrvs.script.scripter.script;

import amao.proj.jrvs.script.scripter.script.patterner.ScriptPatterner;
import amao.proj.jrvs.script.scripter.script.temp.ScriptTemp;

import java.io.IOException;
import java.util.Scanner;

public class ScriptCentral {

    protected Script script;

    public ScriptCentral(Script script) {
        this.script = script;
    }

    public void process() {
        final ScriptTemp scriptTemp = new ScriptTemp(this.script);
        scriptTemp.writeTemp();
        final Script temp = scriptTemp.getTemp();
        try {
            Scanner scanner = new Scanner(temp.get());
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!(line.startsWith("#"))) new ScriptPatterner(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
