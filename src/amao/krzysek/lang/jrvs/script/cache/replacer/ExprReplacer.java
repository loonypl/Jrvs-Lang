package amao.krzysek.lang.jrvs.script.cache.replacer;

import amao.krzysek.lang.jrvs.collections.ExpressionsCollection;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ExprReplacer {

    protected LinkedHashMap<String, Class> exprs;
    protected LinkedList<String> replace;

    public ExprReplacer(LinkedList<String> replace) {
        this.exprs = new ExpressionsCollection().getCollection();
        this.replace = replace;
    }

    public LinkedList<String> getReplaced() {
        LinkedList<String> script = this.replace;
        for (String line : script) {
            String replace = line;
            if (!(replace.startsWith("#"))) {
                for (String expr : this.exprs.keySet()) {
                    String[] split = expr.split("\\.");
                    String name = split[0];
                    String exprIn = StringUtils.substringBetween(replace, "%", "%");
                    if (exprIn != null) {
                        String exprInName = null;
                        if (exprIn.contains("\"")) {
                            exprInName = "";
                            for (int i = 0; i < exprIn.length(); i++) {
                                if (String.valueOf(exprIn.charAt(i)).equalsIgnoreCase("\"")) break;
                                else exprInName = exprInName + String.valueOf(exprIn.charAt(i));
                            }
                            exprInName = exprInName.substring(0, exprInName.length()-1);
                        } else if (!(exprIn.contains("\""))) exprInName = exprIn;
                        if (exprInName != null) {
                            if (exprInName.equalsIgnoreCase(name)) {
                                String[] args = StringUtils.substringsBetween(exprIn, "\"", "\"");
                                LinkedList<Object> rawArgs = new LinkedList<>();
                                if (args != null) rawArgs.addAll(Arrays.asList(args));
                                Class c = this.exprs.get(expr);
                                Object obj = null;
                                try {
                                    try {
                                        obj = c.getMethod("run", LinkedList.class).invoke(null, rawArgs);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                    } catch (InvocationTargetException e) {
                                        e.printStackTrace();
                                    } catch (NoSuchMethodException e) {
                                        e.printStackTrace();
                                    }
                                } finally {
                                    for (int i = 0; i < script.size(); i++)
                                        script.set(i, script.get(i).replaceAll("%" + exprIn + "%", String.valueOf(obj)));
                                }
                            }
                        }
                    }
                }
            }
        }
        return script;
    }

}
