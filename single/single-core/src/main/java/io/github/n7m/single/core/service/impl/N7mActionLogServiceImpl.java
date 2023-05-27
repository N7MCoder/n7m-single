package io.github.n7m.single.core.service.impl;
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
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.n7m.single.core.dao.N7mActionLogDao;
import io.github.n7m.single.core.model.N7mActionLog;
import io.github.n7m.single.core.model.vo.N7mActionLogVo;
import io.github.n7m.single.core.service.N7mActionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class N7mActionLogServiceImpl extends ServiceImpl<N7mActionLogDao, N7mActionLog> implements N7mActionLogService {

    @Autowired
    private N7mActionLogDao n7mActionLogDao;

    @Override
    public IPage<N7mActionLogVo> queryPage(String name, Integer page, Integer size) {
        return n7mActionLogDao.queryPage(name, new Page<>(page, size));
    }

    @Override
    public IPage<N7mActionLogVo> queryPageUser(String userId, Integer page, Integer size) {
        return n7mActionLogDao.selectPageByUser(userId, new Page<>(page, size));
    }

}