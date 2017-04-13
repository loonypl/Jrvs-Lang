package amao.krzysek.lang.jrvs.collections.executors.effects.system;

import java.util.LinkedList;

public class Console {

    public Console(LinkedList<Object> objs) {
        String output = (String) objs.get(0);
        System.out.println(output);
    }

}
