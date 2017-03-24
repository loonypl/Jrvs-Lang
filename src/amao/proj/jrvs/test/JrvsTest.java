package amao.proj.jrvs.test;

import amao.proj.jrvs.script.JrvsScript;
import amao.proj.jrvs.script.scripter.Scripter;
import amao.proj.jrvs.script.scripter.script.Script;

public class JrvsTest {

    protected static JrvsScript jrvs;
    protected static Scripter scripter;

    public static void main(String[] args) {
        jrvs = new JrvsScript();
        scripter = new Scripter(jrvs);
        scripter.registerScript(new Script("E:/IdeaProjects/Jrvs Script 2/scripts/test.jrvs"));
        scripter.setup();
        scripter.runScripts();
    }

}
