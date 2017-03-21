package amao.proj.jrvs.scripter.validator;

public class Validator {

    protected ValidatorType type;

    public Validator(ValidatorType type) {
        this.type = type;
    }

    public boolean validate(String scriptName) {
        if (scriptName != null) {
            return scriptName.endsWith(".jrvs");
        } else {
            return false;
        }
    }

}
