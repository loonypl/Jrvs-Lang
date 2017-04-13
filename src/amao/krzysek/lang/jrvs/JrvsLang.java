package amao.krzysek.lang.jrvs;

import amao.krzysek.lang.jrvs.script.Script;
import amao.krzysek.lang.jrvs.script.cache.ScriptCache;
import amao.krzysek.lang.jrvs.script.cache.replacer.ExprReplacer;
import amao.krzysek.lang.jrvs.script.cache.replacer.VarReplacer;
import amao.krzysek.lang.jrvs.script.searcher.Searcher;

import java.util.LinkedList;

public class JrvsLang {

    protected LinkedList<Script> scripts;

    public JrvsLang() {
        this.scripts = new LinkedList<>();
    }

    public boolean registerScript(Script script) {
        if (!(this.scripts.contains(script))) {
            if (script.get().getName().endsWith(".jrvs")) {
                this.scripts.add(script);
                return true;
            } else return false;
        } else return false;
    }

    public boolean registerScripts(Script[] list) {
        LinkedList<Script> temp = new LinkedList<>();
        for (Script script : list) {
            if (this.scripts.contains(script)) return false;
            if (!(script.get().getName().endsWith(".jrvs"))) return false;
        }
        for (Script script : list) this.scripts.add(script);
        return true;
    }

    public void run() {
        if (this.scripts != null) {
            for (Script script : this.scripts) {
                ScriptCache scriptCache = new ScriptCache(script);
                ExprReplacer exprReplacer = new ExprReplacer(scriptCache.getCache());
                VarReplacer varReplacer = new VarReplacer(exprReplacer.getReplaced());
                for (String line : varReplacer.getReplaced()) new Searcher(line).search();
            }
        }
    }

}
