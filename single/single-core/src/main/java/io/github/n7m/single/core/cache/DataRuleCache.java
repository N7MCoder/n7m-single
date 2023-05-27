package io.github.n7m.single.core.cache;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;

public class DataRuleCache {

    private static Cache<String, Object> lfuCache;

    private DataRuleCache() {
    }

    public static Cache<String, Object> getInstance() {
        if (null == lfuCache) {
            lfuCache = CacheUtil.newLFUCache(1000);
        }
        return lfuCache;
    }

}
