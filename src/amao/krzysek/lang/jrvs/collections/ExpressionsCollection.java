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
        // %substrings between [string] [from (string)] [to (string)] [index (integer)]%
        collection.put("substrings between.[%% %% %% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.Between.class);
        // %count in string [string] [letter to count (string)]%
        collection.put("count in string.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.Count.class);
        // %amount of letters in string [string]%
        collection.put("amount of letters in string.[%%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.CountAll.class);
        collection.put("get random letter.", amao.krzysek.lang.jrvs.collections.executors.expressions.string.RandomLetter.class);
        // %get random integer between [integer] [integer]%
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

        // new

        // string
        // %get char at [integer (index)] [string]%
        collection.put("get char at.[%% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.CharAt.class);

        // %replace all [string (to replace)] [string (as replacement)] [string]%
        collection.put("replace all.[%% %% %%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.ReplaceAll.class);

        // %get md5 hash of [string]%
        collection.put("get md5 hash of.[%%]", amao.krzysek.lang.jrvs.collections.executors.expressions.string.HashMd5.class);

        // system
        // %get os name%
        collection.put("get os name.", amao.krzysek.lang.jrvs.collections.executors.expressions.system.Name.class);

        // %get os version%
        collection.put("get os version.", amao.krzysek.lang.jrvs.collections.executors.expressions.system.Version.class);

        // %get os architecture%
        collection.put("get os architecture.", amao.krzysek.lang.jrvs.collections.executors.expressions.system.Architecture.class);

        // %get user dir%
        collection.put("get user dir.", amao.krzysek.lang.jrvs.collections.executors.expressions.system.user.Dir.class);

        // %get user home%
        collection.put("get user home.", amao.krzysek.lang.jrvs.collections.executors.expressions.system.user.Home.class);

        // %get user name%
        collection.put("get user name.", amao.krzysek.lang.jrvs.collections.executors.expressions.system.user.Name.class);

        // java
        // %get java dir%
        collection.put("get java dir.", amao.krzysek.lang.jrvs.collections.executors.expressions.java.Dir.class);

        // %get java vendor%
        collection.put("get java vendor.", amao.krzysek.lang.jrvs.collections.executors.expressions.java.Vendor.class);

        // %get java vendor url%
        collection.put("get java vendor url.", amao.krzysek.lang.jrvs.collections.executors.expressions.java.VendorUrl.class);

        // %get java version%
        collection.put("get java version.", amao.krzysek.lang.jrvs.collections.executors.expressions.java.Version.class);

        // jrvs
        // %get jrvs version%
        collection.put("get jrvs version.", amao.krzysek.lang.jrvs.collections.executors.expressions.jrvs.Version.class);

        // %get jrvs vendor%
        collection.put("get jrvs vendor.", amao.krzysek.lang.jrvs.collections.executors.expressions.jrvs.Vendor.class);

        // %get jrvs vendor url%
        collection.put("get jrvs vendor url.", amao.krzysek.lang.jrvs.collections.executors.expressions.jrvs.VendorUrl.class);

        // end
        return collection;
    }

}
