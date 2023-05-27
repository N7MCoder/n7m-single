package io.github.n7m.single.core.cache;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;

public class PermissionCache {

    private static Cache<String, Object> lfuCache;

    private PermissionCache() {
    }

    public static Cache<String, Object> getInstance() {
        if (null == lfuCache) {
            lfuCache = CacheUtil.newLFUCache(1000);
        }
        return lfuCache;
    }

}
