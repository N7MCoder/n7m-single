package io.github.n7m.single.core.util.tree;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2020/4/22 15:49
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeParser {

    public static <T extends Tree<T>> List<T> listToTree(String root, List<T> list) {
        return TreeParser.listToTree(root, list, 0);
    }

    public static <T extends Tree<T>> List<T> listToTree(String root, List<T> list, int level) {
        if (level == 0) {
            return TreeParser.normal(root, list);
        } else {
            return TreeParser.level(root, list, level, 0);
        }
    }

    public static <T extends Tree<T>> List<String> allChild(String pid, List<T> list) {
        return loopChild(pid, list).stream().map(Tree::getId).collect(Collectors.toList());
    }

    private static <T extends Tree<T>> List<T> loopChild(String pid, List<T> list) {
        List<T> result = new ArrayList<>();
        list.forEach(item -> {
            if (item.getParentId().equals(pid)) {
                result.add(item);
                result.addAll(loopChild(item.getId(), list));
            }
        });
        return result;
    }

    private static <T extends Tree<T>> List<T> normal(String root, List<T> list) {
        List<T> resultList = list.stream().filter(t -> t.getParentId().equals(root)).collect(Collectors.toList());
        resultList.forEach(t -> t.setChild(normal(t.getId(), list)));
        return resultList;
    }

    private static <T extends Tree<T>> List<T> level(String root, List<T> list, int level, int current) {
        List<T> resultList = list.stream().filter(t -> t.getParentId().equals(root)).collect(Collectors.toList());
        if (current < (level - 1)) {
            int lvl = current + 1;
            resultList.forEach(t -> t.setChild(level(t.getId(), list, level, lvl)));
        }
        return resultList;
    }

}
