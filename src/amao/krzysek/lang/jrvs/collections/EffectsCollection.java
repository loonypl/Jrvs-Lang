package amao.krzysek.lang.jrvs.collections;

import java.util.LinkedHashMap;

public class EffectsCollection {

    public EffectsCollection() {}

    public LinkedHashMap<String, Class> getCollection() {
        LinkedHashMap<String, Class> collection = new LinkedHashMap<>();
        // adding to hash map
        // system
        // console [string]
        collection.put("console.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.system.Console.class);
        // file
        // create file [string (path)]
        collection.put("create file.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.file.Create.class);
        // delete file [string (path)]
        collection.put("delete file.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.file.Delete.class);
        // write file [string (path)] [string (to write)]
        collection.put("write file.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.effects.file.Write.class);
        // folder
        // create folder [string (path)]
        collection.put("create folder.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.folder.Create.class);
        // delete folder [string (path)]
        collection.put("delete folder.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.folder.Delete.class);
        // program
        // wait and execute [int (delay in seconds)] [effects (splitted by ', ')]
        collection.put("wait and execute.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.effects.program.Wait.class);
        collection.put("exit program.", amao.krzysek.lang.jrvs.collections.executors.effects.program.Exit.class);
        // universal
        // repeat [int (how many times to repeat)] [effects (splitted by ', ')]
        collection.put("repeat.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.effects.universal.Repeat.class);
        // end
        return collection;
    }

}
