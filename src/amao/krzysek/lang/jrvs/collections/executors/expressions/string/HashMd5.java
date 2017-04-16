package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

public class HashMd5 {

    public static Object run(LinkedList<Object> objs) {
        String string = (String) objs.get(0);
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (md != null) {
            md.update(StandardCharsets.UTF_8.encode(string));
            return String.format("%032x", new BigInteger(1, md.digest()));
        } else return null;
    }

}
