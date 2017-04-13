package amao.krzysek.lang.jrvs.collections;

import java.util.LinkedHashMap;

public class ExpressionsCollection {

    public ExpressionsCollection() {}

    public LinkedHashMap<String, Class> getCollection() {
        LinkedHashMap<String, Class> collection = new LinkedHashMap<>();
        // adding to hash map
        collection.put("get time.", amao.krzysek.lang.jrvs.collections.executors.expressions.time.Get.class);
        collection.put("get time minute.", amao.krzysek.lang.jrvs.collections.executors.expressions.time.Minute.class);
        collection.put("get time hour.", amao.krzysek.lang.jrvs.collections.executors.expressions.time.Hour.class);
        collection.put("get date.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.Get.class);
        collection.put("get date month numeric.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.MonthNumeric.class);
        collection.put("get date month text.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.MonthText.class);
        collection.put("get date day.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.Day.class);
        collection.put("get date year.", amao.krzysek.lang.jrvs.collections.executors.expressions.date.Year.class);
        collection.put("get folders of.[%%]", amao.krzysek.lang.jrvs.collections.executors.expressions.folder.FoldersOf.class);
        // end
        return collection;
    }

}
