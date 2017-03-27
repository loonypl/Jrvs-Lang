package amao.proj.jrvs.script.scripter.script.responders.exprs.date;

import java.time.ZonedDateTime;

public class MonthText {

    public static Object run() {
        return String.valueOf(ZonedDateTime.now().getMonth()).toLowerCase();
    }

}
