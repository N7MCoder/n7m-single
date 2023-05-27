package io.github.n7m.single.core.sql;

import cn.hutool.core.date.DateTime;

import java.sql.Date;
import java.sql.Timestamp;

public class SQLDatetime {

    public static Timestamp time() {
        return SQLDatetime.time(DateTime.now());
    }

    public static Timestamp time(DateTime dateTime) {
        return new Timestamp(dateTime.getTime());
    }

    public static Date date() {
        return SQLDatetime.date(DateTime.now());
    }

    public static Date date(DateTime dateTime) {
        return new Date(dateTime.getTime());
    }

}
