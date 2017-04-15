package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;

public class Between {

    public static Object run(LinkedList<Object> objs) {
        String string = (String) objs.get(0);
        String from = (String) objs.get(1);
        String to = (String) objs.get(2);
        int index = Integer.parseInt((String) objs.get(3));
        return StringUtils.substringsBetween(string, from, to)[index];
    }

}
