package io.github.n7m.single.core.model;
// +----------------------------------------------------------------------
// | 官方网站: www.c2b666.com
// +----------------------------------------------------------------------
// | 功能描述: 文件表
// +----------------------------------------------------------------------
// | 创建时间: 2021-08-01 01:39
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
@TableName(value = "nunumao_file")
public class N7mFile implements Serializable {

    public static final String ID = "id";
    public static final String FOLDER_ID = "folder_id";
    public static final String USER_ID = "user_id";
    public static final String STORE_ID = "store_id";
    public static final String TYPE = "type";
    public static final String NAME = "name";
    public static final String PATH = "path";
    public static final String FILE_NAME = "file_name";
    public static final String FILE_EXT = "file_ext";
    public static final String FILE_FULL_NAME = "file_full_name";
    public static final String FILE_SIZE = "file_size";
    public static final String CREATE_TIME = "create_time";

    /**
     * ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 目录ID
     */
    @TableField(value = FOLDER_ID)
    private String folderId;

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
     * 文件类型[0 图片 | 1 视频 | 2 音频 | 3 文档 | 4 压缩包 | 5 其他]
     */
    @TableField(value = TYPE)
    private Integer type;

    /**
     * 名称
     */
    @TableField(value = NAME)
    private String name;

    /**
     * 路径
     */
    @TableField(value = PATH)
    private String path;

    /**
     * 文件名称
     */
    @TableField(value = FILE_NAME)
    private String fileName;

    /**
     * 扩展名称
     */
    @TableField(value = FILE_EXT)
    private String fileExt;

    /**
     * 文件全名[文件名称+扩展名称]
     */
    @TableField(value = FILE_FULL_NAME)
    private String fileFullName;

    /**
     * 文件大小
     */
    @TableField(value = FILE_SIZE)
    private Long fileSize;

    /**
     * 创建时间
     */
    @TableField(value = CREATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

}