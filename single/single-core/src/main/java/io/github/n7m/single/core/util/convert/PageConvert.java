package io.github.n7m.single.core.util.convert;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.github.n7m.single.core.response.PageEx;

import java.util.List;

public class PageConvert {

    /**
     * 创建分页
     *
     * @param list 列表数据
     * @param page 原始分页数据
     * @param <T>  泛型
     * @return 分页
     */
    public static <T> IPage<T> toPage(List<T> list, IPage<T> page) {
        IPage<T> pages = new PageEx<>();
        pages.setSize(page.getSize());
        pages.setTotal(page.getTotal());
        pages.setCurrent(page.getCurrent());
        pages.setRecords(list);
        pages.setPages(page.getPages());
        return pages;
    }

    /**
     * 创建分页
     *
     * @param list    列表数据
     * @param current 当前页
     * @param size    页大小
     * @param total   总数
     * @param page    总页码
     * @param <T>     泛型
     * @return 分页
     */
    public static <T> IPage<T> toPage(List<T> list, Long current, Long size, Long total, Long page) {
        IPage<T> pages = new PageEx<T>();
        pages.setSize(size);
        pages.setTotal(total);
        pages.setCurrent(current);
        pages.setRecords(list);
        pages.setPages(page);
        return pages;
    }

}
