package io.github.n7m.single.core.model;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 消息表
// +----------------------------------------------------------------------
// | 创建时间: 2021-12-04 17:20
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
import java.io.Serializable;
import lombok.Data;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@TableName(value = "nunumao_message")
public class N7mMessage implements Serializable {

	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String USER_ID = "user_id";
	public static final String DEPART_ID = "depart_id";
	public static final String NAME = "name";
	public static final String INTRO = "intro";
	public static final String CONTENT = "content";
	public static final String LINK = "link";
	public static final String IS_READ = "is_read";
	public static final String SENDED = "sended";
	public static final String CREATE_TIME = "create_time";
	public static final String STATUS = "status";

	/**
	 * ID
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private String id;

	/**
	 * 类型[0 通知 | 1 私信]
	 */
	@TableField(value = TYPE)
	private Integer type;

	/**
	 * 用户ID
	 */
	@TableField(value = USER_ID)
	private String userId;

	/**
	 * 部门ID(多部门 , 分割)
	 */
	@TableField(value = DEPART_ID)
	private String departId;

	/**
	 * 消息标题
	 */
	@TableField(value = NAME)
	private String name;

	/**
	 * 消息简介
	 */
	@TableField(value = INTRO)
	private String intro;

	/**
	 * 消息内容
	 */
	@TableField(value = CONTENT)
	private String content;

	/**
	 * 跳转连接
	 */
	@TableField(value = LINK)
	private String link;

	/**
	 * 读取[0 未读 | 1 已读]
	 */
	@TableField(value = IS_READ)
	private Integer isRead;

	/**
	 * 传达[0 未送达 | 1 已送达]
	 */
	@TableField(value = SENDED)
	private Integer sended;

	/**
	 * 创建时间
	 */
	@TableField(value = CREATE_TIME)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Timestamp createTime;

	/**
	 * 状态
	 */
	@TableField(value = STATUS)
	private Integer status;

}