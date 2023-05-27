package io.github.n7m.single.core.sql;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2022/9/7 12:34
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V 0.0.1
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.StringReader;
import java.sql.SQLException;

@Component
public class SQLRunner {

    @Autowired
    private DataSource dataSource;

    public void exec(String sql) throws SQLException {
        ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
        runner.setAutoCommit(false);
        runner.setStopOnError(true);
        runner.runScript(new StringReader(sql));
    }

    public String databse() throws SQLException {
        return dataSource.getConnection().getSchema();
    }

}
