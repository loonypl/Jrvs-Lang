package amao.proj.jrvs.script.scripter.script.responders.exprs.date;

import java.time.ZonedDateTime;

public class Year {

    public static Object run() {
        return ZonedDateTime.now().getYear();
    }

}
