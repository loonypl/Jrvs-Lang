package amao.krzysek.test.jrvs;

import amao.krzysek.lang.jrvs.JrvsLang;
import amao.krzysek.lang.jrvs.script.Script;

public class Test {

    public static void main(String[] args) {
        JrvsLang lang = new JrvsLang();
        lang.registerScript(new Script("E:/IdeaProjects/Jrvs Language/scripts/main.jrvs"));
        lang.run();
    }

}
