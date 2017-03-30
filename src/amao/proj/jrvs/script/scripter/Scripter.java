package amao.proj.jrvs.script.scripter;

import amao.proj.jrvs.script.JrvsScript;
import amao.proj.jrvs.script.scripter.script.Script;
import amao.proj.jrvs.script.scripter.script.ScriptCentral;
import amao.proj.jrvs.script.scripter.script.patterner.collection.Collection;
import amao.proj.jrvs.script.scripter.validator.Validator;
import amao.proj.jrvs.script.scripter.validator.ValidatorType;

import java.io.File;
import java.util.LinkedList;

public class Scripter {

    protected JrvsScript jrvs;

    protected LinkedList<Script> scripts = new LinkedList<>();

    public Scripter(JrvsScript jrvs) {
        this.jrvs = jrvs;
    }

    public boolean registerScript(Script script) {
        if (script != null) {
            final Validator validator = new Validator(ValidatorType.SCRIPT_PATH);
            if (validator.validate(script)) {
                this.scripts.add(script);
                return true;
            } else return false;
        } else return false;
    }

    public boolean registerScripts(Script[] scripts) {
        if (scripts != null) {
            final Validator validator = new Validator(ValidatorType.SCRIPT_PATH);
            LinkedList<Script> valid = new LinkedList<>();
            for (Script script : scripts) if (validator.validate(script)) valid.add(script);
            if (scripts.length == valid.size()) {
                for (Script script : scripts) this.scripts.add(script);
                return true;
            } else return false;
        } else return false;
    }

    public void runScripts() {
        if (this.scripts != null) {
            for (Script script : this.scripts) new ScriptCentral(script).process();
        }
    }

    protected LinkedList<Script> getScripts() {
        return this.scripts;
    }

    public void registerEffect(String pattern, Class executor) {
        new Collection().registerEffect(pattern, executor);
    }

    public void registerExpression(String pattern, Class responder) {
        new Collection().registerExpression(pattern, responder);
    }

    public void setup() {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                LinkedList<Script> scripts = getScripts();
                for (Script script : scripts) {
                    File temp = new File(script.get().getParentFile().getPath() + "/_temp/" + script.get().getName());
                    if (temp.exists()) temp.delete();
                }
            }
        }));
    }

}
