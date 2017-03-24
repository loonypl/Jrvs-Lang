package amao.proj.jrvs.script.scripter.validator;

import amao.proj.jrvs.script.scripter.script.Script;

public class Validator {

    protected ValidatorType type;

    public Validator(ValidatorType type) {
        this.type = type;
    }

    public boolean validate(Script script) {
        if (script != null) return script.get().getName().endsWith(".jrvs");
        else return false;
    }

}
