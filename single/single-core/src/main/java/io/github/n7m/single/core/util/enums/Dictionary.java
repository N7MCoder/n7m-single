package io.github.n7m.single.core.util.enums;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2021/10/20
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public interface Dictionary<E> extends Serializable {

    String getKey();

    E getValue();

    static <T extends Enum<T> & Dictionary<E>, E> T get(Class<T> type, E e) {

        return null;
    }

    static <T extends Dictionary> String getKey(T[] values, Object value) {
        return Dictionary.getEnum(values, value).getKey();
    }

    static <T extends Dictionary> T getEnum(T[] values, Object value) {
        List<T> list = Arrays.asList(values);
        return Objects.requireNonNull(list.stream().filter(item -> item.getValue().equals(value)).findFirst().orElse(null));
    }

    static <T extends Dictionary> List<KeyValue> list(T[] values) {
        List<KeyValue> list = new ArrayList<>();
        for (Dictionary item : values) {
            list.add(new KeyValue() {{
                setKey(item.getKey());
                setValue(item.getValue());
            }});
        }
        return list;
    }

}
