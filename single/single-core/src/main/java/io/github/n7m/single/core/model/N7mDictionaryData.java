package io.github.n7m.single.core.model;
// +----------------------------------------------------------------------
// | 官方网站: #website#
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: #date#
// +----------------------------------------------------------------------
// | 代码创建: #author# <#email#>
// +----------------------------------------------------------------------
// | 版本信息: V 0.0.1
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName(value = "system_dictionary_data")
public class N7mDictionaryData implements Serializable {

	public static final String ID = "id";
	public static final String DICTIONARY_ID = "dictionary_id";
	public static final String NAME = "name";
	public static final String VAL = "val";
	public static final String INTRO = "intro";
	public static final String STATUS = "status";


	/**
	 * ID
	 */
	@TableId(type = IdType.ASSIGN_ID)
	private String id;

	/**
	 * 字典ID
	 */
	@TableField(value = DICTIONARY_ID)
	private String dictionaryId;

	/**
	 * 名称
	 */
	@TableField(value = NAME)
	private String name;

	/**
	 * 值
	 */
	@TableField(value = VAL)
	private String val;

	/**
	 * 描述
	 */
	@TableField(value = INTRO)
	private String intro;

	/**
	 * 状态[0 禁用 | 1 启用]
	 */
	@TableField(value = STATUS)
	private Integer status;


}