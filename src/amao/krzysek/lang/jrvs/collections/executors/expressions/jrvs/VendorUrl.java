package amao.krzysek.lang.jrvs.collections.executors.expressions.jrvs;

import java.util.LinkedList;

public class VendorUrl {

    final static String vendorUrl = "http://www.amao.pl/";

    public static Object run(LinkedList<Object> objs) {
        return String.valueOf(vendorUrl);
    }

}
