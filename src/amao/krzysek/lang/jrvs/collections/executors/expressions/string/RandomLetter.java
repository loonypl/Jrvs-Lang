package amao.krzysek.lang.jrvs.collections.executors.expressions.string;

import java.util.LinkedList;
import java.util.Random;

public class RandomLetter {

    public static Object run(LinkedList<Object> objs) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int random = new Random().nextInt(25);
        return String.valueOf(alphabet.charAt(random));
    }

}
