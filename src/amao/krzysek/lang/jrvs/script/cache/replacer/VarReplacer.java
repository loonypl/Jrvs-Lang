package amao.krzysek.lang.jrvs.script.cache.replacer;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class VarReplacer {

    protected LinkedHashMap<String, String> vars = new LinkedHashMap<>();
    protected LinkedList<String> replace;

    public VarReplacer(LinkedList<String> replace) {
        this.replace = replace;
    }

    public LinkedList<String> getReplaced() {
        LinkedList<String> script = this.replace;
        for (String line : script) {
            String replace = line;
            try {
                if (replace.startsWith("var ")) {
                    String[] var = StringUtils.substringsBetween(replace, "'", "'");
                    if (!(this.vars.containsKey(var[0]))) this.vars.put(var[0], var[1]);
                }
            } finally {
                for (String key : this.vars.keySet()) replace = replace.replaceAll(";" + key + ";", this.vars.get(key));
            }
            for (int i = 0; i < script.size(); i++) if (script.get(i).equalsIgnoreCase(line)) script.set(i, replace);
        }
        return script;
    }

}
