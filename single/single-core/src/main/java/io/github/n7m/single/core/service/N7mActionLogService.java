package io.github.n7m.single.core.service;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: Nunumao代码生成器
// +----------------------------------------------------------------------
// | 创建时间: 2021-10-28 22:18
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V 0.0.1
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import io.github.n7m.single.core.model.N7mActionLog;
import io.github.n7m.single.core.model.vo.N7mActionLogVo;

public interface N7mActionLogService extends IService<N7mActionLog> {

    IPage<N7mActionLogVo> queryPage(String name, Integer page, Integer size);

    IPage<N7mActionLogVo> queryPageUser(String userId, Integer page, Integer size);

}