package amao.proj.jrvs.scripter.script.executors.effects;

import java.util.LinkedList;

public class Console {

    public Console(LinkedList<Object> objs) {
        String output = (String) objs.get(0);
        System.out.println(output);
    }

}
