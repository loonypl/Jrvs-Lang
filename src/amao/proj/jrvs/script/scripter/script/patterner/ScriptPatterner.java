package amao.proj.jrvs.script.scripter.script.patterner;

import amao.proj.jrvs.script.scripter.script.patterner.collection.Collection;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ScriptPatterner {

    protected LinkedList<String> effects = new Collection().getEffects();
    protected LinkedHashMap<String, Class> executors = new Collection().getExecutors();

    public ScriptPatterner(String check) {
        recognizeEffect(check);
        recognizeCondition(check);
    }

    protected void recognizeEffect(String check) {
        for (String effect : this.effects) {
            String effectName = "";
            try {
                for (int i = 0, n = effect.length(); i < n; i++) {
                    if (!(String.valueOf(effect.charAt(i)).equalsIgnoreCase("."))) effectName = effectName + String.valueOf(effect.charAt(i));
                    else break;
                }
            } finally {
                if (check.startsWith(effectName)) {
                    final String[] brackets = StringUtils.substringsBetween(effect, "[", "]");
                    try {
                        Class c = this.executors.get(effect);
                        LinkedList<Object> objs = new LinkedList<>();
                        String[] list = StringUtils.substringsBetween(check, "'", "'");
                        try {
                            for (String string : list) objs.add(string);
                        } finally {
                            c.getDeclaredConstructor(LinkedList.class).newInstance(objs);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    protected void recognizeCondition(String check) {
        if (check.startsWith("if ")) {
            final String[] brackets = StringUtils.substringsBetween(check, "[", "]");
            String[] args = StringUtils.substringsBetween(brackets[0], "'", "'");
            if (args[0].equals(args[1])) {
                String[] effects;
                if (brackets[1].split(",").length != 0) effects = brackets[1].split(",");
                else effects = brackets[1].split(", ");
                if (effects.length != 0) {
                    for (String effect : effects) new ScriptPatterner(effect);
                }
            }
        } else if (check.startsWith("!if ")) {
            final String[] brackets = StringUtils.substringsBetween(check, "[", "]");
            String[] args = StringUtils.substringsBetween(brackets[0], "'", "'");
            if (!(args[0].equals(args[1]))) {
                String[] effects;
                if (brackets[1].split(",").length != 0) effects = brackets[1].split(",");
                else effects = brackets[1].split(", ");
                if (effects.length != 0) {
                    for (String effect : effects) new ScriptPatterner(effect);
                }
            }
        }
    }

}
