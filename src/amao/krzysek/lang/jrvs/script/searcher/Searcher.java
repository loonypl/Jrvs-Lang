package amao.krzysek.lang.jrvs.script.searcher;

import amao.krzysek.lang.jrvs.collections.EffectsCollection;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Searcher {

    protected LinkedHashMap<String, Class> effects;
    protected String line;

    public Searcher(String line) {
        this.effects = new EffectsCollection().getCollection();
        this.line = line;
    }

    public void search() {
        if (!(this.line.startsWith("#"))) {
            try {
                for (String pattern : this.effects.keySet()) {
                    String[] split = pattern.split("\\.");
                    String name = split[0];
                    if (this.line.startsWith(name)) {
                        String[] args = StringUtils.substringsBetween(this.line, "'", "'");
                        LinkedList<Object> rawArgs = new LinkedList<>();
                        if (args != null) rawArgs.addAll(Arrays.asList(args));
                        Class c = this.effects.get(pattern);
                        try {
                            c.getDeclaredConstructor(LinkedList.class).newInstance(rawArgs);
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } finally {
                if (this.line.startsWith("if ")) {
                    String[] brackets = StringUtils.substringsBetween(this.line, "[", "]");
                    String[] args = StringUtils.substringsBetween(brackets[0], "'", "'");
                    if (args[0].equalsIgnoreCase(args[1])) {
                        LinkedList<String> effects = new LinkedList<>();
                        if (brackets[1].contains(",")) {
                            String[] split = brackets[1].split(", ");
                            effects.addAll(Arrays.asList(split));
                        } else {
                            effects.add(brackets[1]);
                        }
                        if (effects.size() != 0) for (String effect : effects) new Searcher(effect).search();
                    }
                }
                if (this.line.startsWith("!if ")) {
                    String[] brackets = StringUtils.substringsBetween(this.line, "[", "]");
                    String[] args = StringUtils.substringsBetween(brackets[0], "'", "'");
                    if (!(args[0].equalsIgnoreCase(args[1]))) {
                        LinkedList<String> effects = new LinkedList<>();
                        if (brackets[1].contains(",")) {
                            String[] split = brackets[1].split(", ");
                            effects.addAll(Arrays.asList(split));
                        } else {
                            effects.add(brackets[1]);
                        }
                        if (effects.size() != 0) for (String effect : effects) new Searcher(effect).search();
                    }
                }
            }
        }
    }

}
