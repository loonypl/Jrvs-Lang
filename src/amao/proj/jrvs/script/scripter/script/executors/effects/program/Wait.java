package amao.proj.jrvs.script.scripter.script.executors.effects.program;

import amao.proj.jrvs.script.scripter.script.patterner.ScriptPatterner;

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
                new ScriptPatterner(command);
            }
        };
        ScheduledFuture<?> delay = thread.schedule(runnable, timeout, TimeUnit.SECONDS);
    }

}
