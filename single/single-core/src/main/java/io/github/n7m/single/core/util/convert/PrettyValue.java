package io.github.n7m.single.core.util.convert;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2022/9/8 19:19
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V 0.0.1
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import java.time.LocalDateTime;

public class PrettyValue {

    public static String convertString(Object o) {
        if (o instanceof LocalDateTime) {
            return o.toString().replaceAll("T", " ").replaceAll("\\.\\d{3,9}", "");
        }
        return o.toString();
    }

}
