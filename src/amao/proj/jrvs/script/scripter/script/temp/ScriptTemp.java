package amao.proj.jrvs.script.scripter.script.temp;

import amao.proj.jrvs.script.scripter.script.Script;
import org.apache.commons.lang3.StringUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ScriptTemp {

    protected LinkedHashMap<String, String> vars = new LinkedHashMap<>();
    protected LinkedHashMap<String, Class> exprs = new LinkedHashMap<>();

    protected Script script;
    protected Script scriptTemp;

    protected void collectExprs() {
        exprs.put("get time", amao.proj.jrvs.script.scripter.script.responders.exprs.time.Get.class);
        exprs.put("get time minute", amao.proj.jrvs.script.scripter.script.responders.exprs.time.Minute.class);
        exprs.put("get time hour", amao.proj.jrvs.script.scripter.script.responders.exprs.time.Hour.class);
        exprs.put("get date", amao.proj.jrvs.script.scripter.script.responders.exprs.date.Get.class);
        exprs.put("get date month numeric", amao.proj.jrvs.script.scripter.script.responders.exprs.date.MonthNumeric.class);
        exprs.put("get date month text", amao.proj.jrvs.script.scripter.script.responders.exprs.date.MonthText.class);
        exprs.put("get date day", amao.proj.jrvs.script.scripter.script.responders.exprs.date.Day.class);
        exprs.put("get date year", amao.proj.jrvs.script.scripter.script.responders.exprs.date.Year.class);
    }

    public ScriptTemp(Script script) {
        this.script = script;
        this.scriptTemp = new Script(script.get().getParentFile().getPath() + "/_temp/" + script.get().getName());
        collectExprs();
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
                        for (String expr : this.exprs.keySet()) {
                            if (line.contains("%" + expr + "%")) {
                                Class c = this.exprs.get(expr);
                                Object obj = null;
                                try {
                                    try {
                                        obj = c.getMethod("run").invoke(null);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                    } catch (InvocationTargetException e) {
                                        e.printStackTrace();
                                    }
                                } catch (NoSuchMethodException e) {
                                    e.printStackTrace();
                                }
                                line = line.replaceAll("%" + expr + "%", String.valueOf(obj));
                            }
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
