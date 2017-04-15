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
        // %substrings between [string] [from (string)] [to (string)] [index (int)]%
        collection.put("substrings between.[%% %% %% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.Between.class);
        // %count in string [string] [letter to count (string)]%
        collection.put("count in string.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.Count.class);
        // %amount of letters in string "test"%
        collection.put("amount of letters in string.[%%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.CountAll.class);
        collection.put("get random letter", amao.krzysek.lang.jrvs.collections.executors.expressions.string.RandomLetter.class);
        // %get random integer between "10" "50"%
        collection.put("get random integer between.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.RandomBetween.class);
        collection.put("get random integer.", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.Random.class);
        collection.put("get random double.", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.familiar.DoubleRandom.class);
        // %plus integer [integer] [integer]%
        collection.put("plus integer.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.Plus.class);
        // %minus integer [integer] [integer]%
        collection.put("minus integer.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.Minus.class);
        // %multiply integer [integer] [integer]%
        collection.put("multiply integer.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.Multiply.class);
        // %divide integer [integer] [integer]%
        collection.put("divide integer.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.Divide.class);
        // %plus double [double] [double]%
        collection.put("plus double.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.familiar.DoublePlus.class);
        // %minus double [double] [double]%
        collection.put("minus double.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.familiar.DoubleMinus.class);
        // %multiply double [double] [double]%
        collection.put("multiply double.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.familiar.DoubleMultiply.class);
        // %divide double [double] [double]%
        collection.put("divide double.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.integer.familiar.DoubleDivide.class);
        // end
        return collection;
    }

}
