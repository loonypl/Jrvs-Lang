package amao.proj.jrvs;

import amao.proj.jrvs.scripter.Scripter;

public class Jrvs {

    // DONE: URLHooker, FILEHooker, MYSQLHooker
    /* TODO:
    ---* Scripter
    * */

    public Jrvs() {}

    public Scripter newScripter() {
        return new Scripter(this);
    }

}
