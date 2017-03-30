package amao.proj.jrvs.script.scripter.script.patterner.collection;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Collection {

    protected LinkedList<String> effects = new LinkedList<>();
    protected LinkedHashMap<String, Class> executors = new LinkedHashMap<>();
    protected LinkedHashMap<String, Class> exprs = new LinkedHashMap<>();

    public Collection() {
        effects();
        expressions();
    }

    public LinkedList<String> getEffects() {
        return this.effects;
    }

    public LinkedHashMap<String, Class> getExecutors() {
        return this.executors;
    }

    public LinkedHashMap<String, Class> getExpressions() {
        return this.exprs;
    }

    protected void addEffect(String pattern, Class c) {
        this.effects.add(pattern);
        this.executors.put(pattern, c);
    }

    protected void effects() {
        addEffect("console.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.system.Console.class);
        addEffect("create file.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.file.Create.class);
        addEffect("delete file.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.file.Delete.class);
        addEffect("write file.[%% %%]", amao.proj.jrvs.script.scripter.script.executors.effects.file.Write.class);
        addEffect("create folder.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.folder.Create.class);
        addEffect("delete folder.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.folder.Delete.class);
        addEffect("wait and execute.[%% %%]", amao.proj.jrvs.script.scripter.script.executors.effects.program.Wait.class);
        addEffect("exit program.", amao.proj.jrvs.script.scripter.script.executors.effects.program.Exit.class);
    }

    protected void expressions() {
        this.exprs.put("get time", amao.proj.jrvs.script.scripter.script.responders.exprs.time.Get.class);
        this.exprs.put("get time minute", amao.proj.jrvs.script.scripter.script.responders.exprs.time.Minute.class);
        this.exprs.put("get time hour", amao.proj.jrvs.script.scripter.script.responders.exprs.time.Hour.class);
        this.exprs.put("get date", amao.proj.jrvs.script.scripter.script.responders.exprs.date.Get.class);
        this.exprs.put("get date month numeric", amao.proj.jrvs.script.scripter.script.responders.exprs.date.MonthNumeric.class);
        this.exprs.put("get date month text", amao.proj.jrvs.script.scripter.script.responders.exprs.date.MonthText.class);
        this.exprs.put("get date day", amao.proj.jrvs.script.scripter.script.responders.exprs.date.Day.class);
        this.exprs.put("get date year", amao.proj.jrvs.script.scripter.script.responders.exprs.date.Year.class);
    }

}
