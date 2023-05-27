package io.github.n7m.single.core.util.enums;
// +----------------------------------------------------------------------
// | 官方网站: www.c2b666.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2020/4/20 19:37
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum BooleanEnum {

    YES(1), NO(0);

    private static final Map<Integer, BooleanEnum> maps = new HashMap<>();

    static {
        for (BooleanEnum item : values()) {
            maps.put(item.getValue(), item);
        }
    }

    private int value;

    public static BooleanEnum getEnum(Integer value) {
        return maps.get(value);
    }

}
