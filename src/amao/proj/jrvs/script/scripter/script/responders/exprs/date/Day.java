package amao.proj.jrvs.script.scripter.script.responders.exprs.date;

import java.time.ZonedDateTime;

public class Day {

    public static Object run() {
        return ZonedDateTime.now().getDayOfMonth();
    }

}
