package amao.proj.jrvstest;

import amao.proj.jrvs.Jrvs;
import amao.proj.jrvs.scripter.Scripter;
import amao.proj.jrvs.scripter.script.Script;

public class JrvsTest {

    protected static Jrvs jrvs;
    protected static Scripter scripter;

    public static void main(String[] args) {
        jrvs = new Jrvs();
        scripter = new Scripter(jrvs);
        scripter.registerScript(new Script("E:/IdeaProjects/Jrvs Script/jrvs-scripts/test.jrvs"));
        scripter.runScripts();
    }

}
