package amao.proj.jrvs.script.scripter.script.responders.exprs.time;

import java.time.ZonedDateTime;

public class Minute {

    public static Object run() {
        return ZonedDateTime.now().getMinute();
    }

}
