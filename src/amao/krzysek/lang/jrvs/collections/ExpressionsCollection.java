package amao.krzysek.lang.jrvs.collections;

import java.util.LinkedHashMap;

public class ExpressionsCollection {

    public ExpressionsCollection() {}

    public LinkedHashMap<String, Class> getCollection() {
        LinkedHashMap<String, Class> collection = new LinkedHashMap<>();
        // adding to hash map
        // time
        collection.put("get time.", amao.krzysek.lang.jrvs.collections.executors.expressions.time.Get.class);
        collection.put("get time minute.", amao.krzysek.lang.jrvs.collections.executors.expressions.time.Minute.class);
        collection.put("get time hour.", amao.krzysek.lang.jrvs.collections.executors.expressions.time.Hour.class);
        // date
        collection.put("get date.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.Get.class);
        collection.put("get date month numeric.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.MonthNumeric.class);
        collection.put("get date month text.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.MonthText.class);
        collection.put("get date day.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.Day.class);
        collection.put("get date year.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.Year.class);
        // folder
        // %get folders of [string (path to folder/dir)]%
        collection.put("get folders of.[%%]", amao.krzysek.lang.jrvs.collections.executors.expressions.folder.FoldersOf.class);
        // string
        // %get first letter of [string]%
        collection.put("get first letter of.[%%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.First.class);
        // %get last letter of [string]%
        collection.put("get last letter of.[%%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.Last.class);
        // %substrings between [string] [from (string)] [to (string)] [index (int)]
        collection.put("substrings between.[%% %% %% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.Between.class);
        // %count in string [string] [letter to count (string)]%
        collection.put("count in string.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.Count.class);
        // end
        return collection;
    }

}
