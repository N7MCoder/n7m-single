package io.github.n7m.single.core.util.login;
// +----------------------------------------------------------------------
// | 广西西途比网络科技有限公司 www.c2b666.com
// +----------------------------------------------------------------------
// | 功能描述: 登录用户角色
// +----------------------------------------------------------------------
// | 时　　间: 2019-02-13  02:19
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import java.util.HashMap;
import java.util.Map;

public enum LoginRoleEnum {

    MEMBER(LoginRole.MEMBER_VALUE, LoginRole.MEMBER),
    STORE(LoginRole.STORE_VALUE, LoginRole.STORE),
    ADMIN(LoginRole.ADMIN_VALUE, LoginRole.ADMIN);

    private final Integer value;
    private final String name;
    private static final Map<Integer, String> maps = new HashMap<>();

    static {
        for (LoginRoleEnum item : values()) {
            maps.put(item.getValue(), item.getName());
        }
    }

    LoginRoleEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getNameByValue(Integer value) {
        return maps.get(value);
    }

    public static Integer getValueByName(String name) {
        int v = 0;
        for (Map.Entry<Integer, String> entry : maps.entrySet()) {
            if (name.equals(entry.getValue())) {
                v = entry.getKey();
                break;
            }
        }
        return v;
    }

}
