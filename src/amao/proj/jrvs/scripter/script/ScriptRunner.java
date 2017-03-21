package amao.proj.jrvs.scripter.script;

import java.io.IOException;
import java.util.Scanner;

public class ScriptRunner {

    protected Script script;

    public ScriptRunner(Script script) {
        this.script = script;
    }

    public void run() {
        try {
            Scanner scanner = new Scanner(this.script.get());
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!(line.startsWith("#"))) new ScriptPatterner(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
