package io.github.n7m.single.core.model;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 中国行政地区表
// +----------------------------------------------------------------------
// | 创建时间: 2021-09-27 15:22
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V 0.0.1
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName(value = "nunumao_area")
public class N7mArea implements Serializable {

	public static final String ID = "id";
	public static final String LEVEL = "level";
	public static final String ZIP_CODE = "zip_code";
	public static final String TELEPHONE_CODE = "telephone_code";
	public static final String REGION = "region";
	public static final String AD_CODE = "ad_code";
	public static final String NAME = "name";
	public static final String FULL_NAME = "full_name";
	public static final String MERGE_NAME = "merge_name";
	public static final String INITIAL = "initial";
	public static final String PINYIN = "pinyin";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";

	/**
	 * ID
	 */
	@TableField(value = ID)
	private String id;

	/**
	 * 层级
	 */
	@TableField(value = LEVEL)
	private Integer level;

	/**
	 * 邮政编码
	 */
	@TableField(value = ZIP_CODE)
	private String zipCode;

	/**
	 * 区号
	 */
	@TableField(value = TELEPHONE_CODE)
	private String telephoneCode;

	/**
	 * 大区名称
	 */
	@TableField(value = REGION)
	private String region;

	/**
	 * 行政代码
	 */
	@TableField(value = AD_CODE)
	private String adCode;

	/**
	 * 简称
	 */
	@TableField(value = NAME)
	private String name;

	/**
	 * 名称
	 */
	@TableField(value = FULL_NAME)
	private String fullName;

	/**
	 * 组合名
	 */
	@TableField(value = MERGE_NAME)
	private String mergeName;

	/**
	 * 首字母
	 */
	@TableField(value = INITIAL)
	private String initial;

	/**
	 * 拼音
	 */
	@TableField(value = PINYIN)
	private String pinyin;

	/**
	 * 维度
	 */
	@TableField(value = LATITUDE)
	private BigDecimal latitude;

	/**
	 * 经度
	 */
	@TableField(value = LONGITUDE)
	private BigDecimal longitude;

}