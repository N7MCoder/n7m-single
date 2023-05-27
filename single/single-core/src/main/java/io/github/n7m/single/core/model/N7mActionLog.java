package io.github.n7m.single.core.model;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 操作日志
// +----------------------------------------------------------------------
// | 创建时间: 2021-10-28 22:18
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V 0.0.1
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@TableName(value = "nunumao_action_log")
public class N7mActionLog implements Serializable {

    public static final String ID = "id";
    public static final String USER_ID = "user_id";
    public static final String CONTENT = "content";
    public static final String CREATE_TIME = "create_time";
    public static final String URL = "url";
    public static final String IP = "ip";
    public static final String PARAMS = "params";
    public static final String ACTION = "action";
    public static final String EXEC_TIME = "exec_time";


    /**
     * ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 用户ID
     */
    @TableField(value = USER_ID)
    private String userId;

    /**
     * 内容
     */
    @TableField(value = CONTENT)
    private String content;

    /**
     * URL
     */
    @TableField(value = URL)
    private String url;

    /**
     * IP
     */
    @TableField(value = IP)
    private String ip;

    /**
     * 参数
     */
    @TableField(value = PARAMS)
    private String params;

    /**
     * 操作
     */
    @TableField(value = ACTION)
    private String action;

    /**
     * 执行时间
     */
    @TableField(value = EXEC_TIME)
    private Long execTime;

    /**
     * 创建时间
     */
    @TableField(value = CREATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

}