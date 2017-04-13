package amao.krzysek.lang.jrvs.collections;

import java.util.LinkedHashMap;

public class EffectsCollection {

    public EffectsCollection() {}

    public LinkedHashMap<String, Class> getCollection() {
        LinkedHashMap<String, Class> collection = new LinkedHashMap<>();
        // adding to hash map
        collection.put("console.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.system.Console.class);
        collection.put("create file.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.file.Create.class);
        collection.put("delete file..[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.file.Delete.class);
        collection.put("write file.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.effects.file.Write.class);
        collection.put("create folder.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.folder.Create.class);
        collection.put("delete folder.[%%]", amao.krzysek.lang.jrvs.collections.executors.effects.folder.Delete.class);
        collection.put("wait and execute.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.effects.program.Wait.class);
        collection.put("exit program.", amao.krzysek.lang.jrvs.collections.executors.effects.program.Exit.class);
        // end
        return collection;
    }

}
