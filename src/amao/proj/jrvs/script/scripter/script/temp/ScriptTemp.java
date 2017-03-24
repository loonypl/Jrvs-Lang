package amao.proj.jrvs.script.scripter.script.temp;

import amao.proj.jrvs.script.scripter.script.Script;
import org.apache.commons.lang3.StringUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ScriptTemp {

    protected LinkedHashMap<String, String> vars = new LinkedHashMap<>();

    protected Script script;
    protected Script scriptTemp;

    public ScriptTemp(Script script) {
        this.script = script;
        this.scriptTemp = new Script(script.get().getParentFile().getPath() + "/_temp/" + script.get().getName());
    }

    public void writeTemp() {
        try {
            if (!(this.scriptTemp.get().exists())) {
                this.scriptTemp.get().getParentFile().mkdirs();
                try {
                    this.scriptTemp.get().createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                this.scriptTemp.get().delete();
            }
        } finally {
            Scanner scanner = null;
            FileWriter writer = null;
            try {
                scanner = new Scanner(this.script.get());
                writer = new FileWriter(this.scriptTemp.get());
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    try {
                        if (line.startsWith("var")) {
                            String[] var = StringUtils.substringsBetween(line, "'", "'");
                            if (!(this.vars.containsKey(var[0]))) this.vars.put(var[0], var[1]);
                        }
                    } finally {
                        for (String key : this.vars.keySet()) {
                            line = line.replaceAll(";" + key + ";", this.vars.get(key));
                        }
                        writer.write(line + System.getProperty("line.separator"));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (scanner != null) scanner.close();
                try {
                    if (writer != null) writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Script getTemp() {
        return this.scriptTemp;
    }

}
