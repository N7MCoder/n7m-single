package io.github.n7m.single.core.dao;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2022/9/7 11:36
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V 0.0.1
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.LinkedHashMap;
import java.util.List;

public interface N7mSqlExecuter {

    @Select(value = "${sql}")
    List<LinkedHashMap<String, Object>> select(String sql);

    @Insert(value = "$sql")
    int insert(String sql);

    @Update(value = "$sql")
    int update(String sql);

    @Delete(value = "$sql")
    int delete(String sql);

}
