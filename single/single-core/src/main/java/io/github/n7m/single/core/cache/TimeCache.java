package io.github.n7m.single.core.cache;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 缓存(带过期功能)
// +----------------------------------------------------------------------
// | 时　　间: 2021/8/31
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.TimedCache;

public class TimeCache {

    private static TimedCache<String, Object> timedCache;

    private TimeCache() {
    }

    public static TimedCache<String, Object> getInstance() {
        if (null == timedCache) {
            long time = 5 * 60 * 1000;
            timedCache = CacheUtil.newTimedCache(time);
        }
        return timedCache;
    }

}
