package io.github.n7m.single.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.github.n7m.single.core.model.N7mActionLog;
import io.github.n7m.single.core.model.vo.N7mActionLogVo;
import org.apache.ibatis.annotations.Param;

public interface N7mActionLogDao extends BaseMapper<N7mActionLog> {

    IPage<N7mActionLogVo> queryPage(@Param(value = "name") String name, IPage<N7mActionLog> page);

    IPage<N7mActionLogVo> selectPageByUser(@Param(value = "userId") String userId, IPage<N7mActionLog> page);

}