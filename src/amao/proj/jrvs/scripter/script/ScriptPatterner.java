package amao.proj.jrvs.scripter.script;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class ScriptPatterner {

    protected ArrayList<String> effects = new ArrayList<>();
    protected LinkedHashMap<String, Class> effectshash = new LinkedHashMap<>();

    protected void collect() {
        // effects
        this.effects.add("console.[%%]");
        this.effectshash.put("console.[%%]", amao.proj.jrvs.scripter.script.executors.effects.Console.class);
        this.effects.add("create file.[%%]");
        this.effectshash.put("create file.[%%]", amao.proj.jrvs.scripter.script.executors.effects.file.Create.class);
        this.effects.add("create folder.[%%]");
        this.effectshash.put("create folder.[%%]", amao.proj.jrvs.scripter.script.executors.effects.folder.Create.class);
        this.effects.add("delete file.[%%]");
        this.effectshash.put("delete file.[%%]", amao.proj.jrvs.scripter.script.executors.effects.file.Delete.class);
        this.effects.add("delete folder.[%%]");
        this.effectshash.put("delete folder.[%%]", amao.proj.jrvs.scripter.script.executors.effects.folder.Delete.class);
        this.effects.add("write file.[%% %%]");
        this.effectshash.put("write file.[%% %%]", amao.proj.jrvs.scripter.script.executors.effects.file.Write.class);
    }

    public ScriptPatterner(String check) {
        collect();
        recognizeEffect(check);
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
                    double doubleargs = 0.0;
                    for (int i = 0, n = brackets[0].length(); i < n; i++) {
                        if(String.valueOf(effect.charAt(i)).equalsIgnoreCase("%")) doubleargs += 0.5;
                    }
                    int args = (int) doubleargs;
                    if (args == 0) {
                        try {
                            Class c = this.effectshash.get(effect);
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
                    } else {
                        Class c = this.effectshash.get(effect);
                        try {
                            c.newInstance();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
