package amao.krzysek.lang.jrvs.collections.executors.effects.program;

import amao.krzysek.lang.jrvs.script.searcher.Searcher;

import java.util.LinkedList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Wait {

    public Wait(LinkedList<Object> objs) {
        int timeout = Integer.parseInt((String) objs.get(0));
        final String command = ((String) objs.get(1)).replaceAll("\\.", "'");
        ScheduledThreadPoolExecutor thread = new ScheduledThreadPoolExecutor(1);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                new Searcher(command).search();
            }
        };
        ScheduledFuture<?> delay = thread.schedule(runnable, timeout, TimeUnit.SECONDS);
    }

}
