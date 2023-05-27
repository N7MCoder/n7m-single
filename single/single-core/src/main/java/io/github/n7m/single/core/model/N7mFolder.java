package io.github.n7m.single.core.model;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2021/10/11
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.n7m.single.core.util.tree.Tree;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@TableName(value = "nunumao_folder")
public class N7mFolder implements Tree<N7mFolder> {

    public static final String ID = "id";
    public static final String PARENT_ID = "parent_id";
    public static final String USER_ID = "user_id";
    public static final String STORE_ID = "store_id";
    public static final String NAME = "name";
    public static final String IS_SYSTEM = "is_system";
    public static final String CREATE_TIME = "create_time";

    /**
     * ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 上级目录
     */
    @TableField(value = PARENT_ID)
    private String parentId;

    /**
     * 所属用户
     */
    @TableField(value = USER_ID)
    private String userId;

    /**
     * 所属商家
     */
    @TableField(value = STORE_ID)
    private String storeId;

    /**
     * 名称
     */
    @TableField(value = NAME)
    private String name;

    /**
     * 系统
     */
    @TableField(value = IS_SYSTEM)
    private Integer isSystem;

    /**
     * 创建时间
     */
    @TableField(value = CREATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

    @TableField(exist = false)
    private List<N7mFolder> child;

    @Override
    public void setChild(List<N7mFolder> child) {
        this.child = child;
    }

}
