package amao.krzysek.lang.jrvs.collections.executors.effects.universal;

import amao.krzysek.lang.jrvs.script.searcher.Searcher;

import java.util.LinkedList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Repeat {

    public Repeat(LinkedList<Object> objs) {
        int times = Integer.parseInt((String) objs.get(0));
        String[] commands = ((String) objs.get(1)).replaceAll("\"", "'").split(", ");
        ScheduledThreadPoolExecutor thread = new ScheduledThreadPoolExecutor(1);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (String command : commands) {
                    new Searcher(command).search();
                }
            }
        };
        for (int i = 0; i < times; i++) {
            ScheduledFuture<?> repeat = thread.schedule(runnable, 0, TimeUnit.SECONDS);
        }
    }

}
