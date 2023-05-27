package io.github.n7m.single.core.model.enums;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2022/4/17
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
public enum N7mUploadType {

    LOCAL("local"),
    MINIO("minio");

    private static final Map<String, N7mUploadType> maps = new HashMap<>();

    static {
        for (N7mUploadType item : values()) {
            maps.put(item.getValue(), item);
        }
    }

    private String value;

    public static N7mUploadType getEnum(Integer value) {
        return maps.get(value);
    }

}
