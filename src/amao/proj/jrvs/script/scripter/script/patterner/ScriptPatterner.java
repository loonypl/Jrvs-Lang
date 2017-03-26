package amao.proj.jrvs.script.scripter.script.patterner;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ScriptPatterner {

    protected LinkedList<String> effects = new LinkedList<>();
    protected LinkedHashMap<String, Class> executors = new LinkedHashMap<>();

    protected void addEffect(String pattern, Class c) {
        this.effects.add(pattern);
        this.executors.put(pattern, c);
    }

    protected void collect() {
        addEffect("console.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.system.Console.class);
        addEffect("create file.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.file.Create.class);
        addEffect("delete file.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.file.Delete.class);
        addEffect("write file.[%% %%]", amao.proj.jrvs.script.scripter.script.executors.effects.file.Write.class);
        addEffect("create folder.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.folder.Create.class);
        addEffect("delete folder.[%%]", amao.proj.jrvs.script.scripter.script.executors.effects.folder.Delete.class);
        addEffect("wait and execute.[%% %%]", amao.proj.jrvs.script.scripter.script.executors.effects.program.Wait.class);
        addEffect("exit program.", amao.proj.jrvs.script.scripter.script.executors.effects.program.Exit.class);
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

}
