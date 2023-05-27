package io.github.n7m.single.core.response;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonView;
import io.github.n7m.single.core.json.GeneralViews;

import java.util.List;

public class PageEx<T> extends Page<T> {

    public PageEx() {
        super();
    }

    public PageEx(long current, long size) {
        super(current, size);
    }

    public PageEx(long current, long size, long total) {
        super(current, size, total);
    }

    public PageEx(long current, long size, boolean isSearchCount) {
        super(current, size, isSearchCount);
    }

    public PageEx(long current, long size, long total, boolean isSearchCount) {
        super(current, size, total, isSearchCount);
    }

    @JsonView(value = GeneralViews.Normal.class)
    @Override
    public List<T> getRecords() {
        return super.getRecords();
    }

    @JsonView(value = GeneralViews.Normal.class)
    @Override
    public long getTotal() {
        return super.getTotal();
    }

    @JsonView(value = GeneralViews.Normal.class)
    @Override
    public long getSize() {
        return super.getSize();
    }

    @JsonView(value = GeneralViews.Normal.class)
    @Override
    public long getCurrent() {
        return super.getCurrent();
    }

    @Override
    public List<OrderItem> getOrders() {
        return super.getOrders();
    }

    @Override
    public boolean isSearchCount() {
        return super.isSearchCount();
    }

    @JsonView(value = GeneralViews.Normal.class)
    @Override
    public long getPages() {
        return super.getPages();
    }

}
