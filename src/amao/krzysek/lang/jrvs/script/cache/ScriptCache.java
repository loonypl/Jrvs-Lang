package amao.krzysek.lang.jrvs.script.cache;

import amao.krzysek.lang.jrvs.script.Script;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class ScriptCache {

    protected Script script;

    public ScriptCache(Script script) {
        this.script = script;
    }

    public LinkedList<String> getCache() {
        LinkedList<String> cache = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(this.script.get());
            while (scanner.hasNextLine()) cache.add(scanner.nextLine());
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cache;
    }

}
