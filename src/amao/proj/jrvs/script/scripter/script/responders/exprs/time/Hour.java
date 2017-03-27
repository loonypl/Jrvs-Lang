package amao.proj.jrvs.script.scripter.script.responders.exprs.time;

import java.time.ZonedDateTime;

public class Hour {

    public static Object run() {
        return ZonedDateTime.now().getHour();
    }

}
