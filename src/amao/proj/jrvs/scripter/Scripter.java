package amao.proj.jrvs.scripter;

import amao.proj.jrvs.Jrvs;
import amao.proj.jrvs.scripter.script.Script;
import amao.proj.jrvs.scripter.script.ScriptPatterner;
import amao.proj.jrvs.scripter.script.ScriptRunner;
import amao.proj.jrvs.scripter.validator.Validator;
import amao.proj.jrvs.scripter.validator.ValidatorType;

import java.util.ArrayList;

public class Scripter {

    protected Jrvs jrvs;

    protected ArrayList<Script> scripts = new ArrayList<>();

    public Scripter(Jrvs jrvs) {
        this.jrvs = jrvs;
    }

    public boolean registerScript(Script script) {
        if (script != null) {
            final Validator validator = new Validator(ValidatorType.SCRIPT_PATH);
            if (validator.validate(script.get().getName())) {
                this.scripts.add(script);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean registerScripts(Script[] scripts) {
        if (scripts != null) {
            final Validator validator = new Validator(ValidatorType.SCRIPT_PATH);
            ArrayList<Script> valid = new ArrayList<>();
            for (Script script : scripts) {
                if (validator.validate(script.get().getName())) {
                    valid.add(script);
                }
            }
            if (valid.size() == scripts.length) {
                for (Script script : scripts) {
                    this.scripts.add(script);
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void runScripts() {
        if (this.scripts != null) {
            for (Script script : scripts) {
                new ScriptRunner(script).run();
            }
        }
    }

}
