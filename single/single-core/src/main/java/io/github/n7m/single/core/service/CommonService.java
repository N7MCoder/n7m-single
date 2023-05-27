package io.github.n7m.single.core.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.github.n7m.single.core.dao.N7mAreaDao;
import io.github.n7m.single.core.model.N7mArea;
import io.github.n7m.single.core.model.N7mDictionary;
import io.github.n7m.single.core.model.N7mDictionaryData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class CommonService {

    // --- 公共 ----------------------------

    @Lazy
    @Autowired
    private N7mCommonService n7mCommonService;

    public N7mCommonService getNunumaoCommonService() {
        return n7mCommonService;
    }

    // --- 行政区 --------------------------

    @Autowired
    private N7mAreaDao n7mAreaDao;

    public class AreaService {

        public static final String PROVINCE = "province";
        public static final String CITY = "city";
        public static final String REGION = "region";

        private AreaService() {

        }

        public Map<String, List<N7mArea>> list(Integer level) {
            Map<String, List<N7mArea>> map = new HashMap<>();
            QueryWrapper<N7mArea> query = new QueryWrapper<>();
            query.eq(N7mArea.LEVEL, 1);
            List<N7mArea> province = n7mAreaDao.selectList(query);
            map.put(PROVINCE, province);
            if (level >= 2) {
                QueryWrapper<N7mArea> cityQuery = new QueryWrapper<>();
                cityQuery.eq(N7mArea.LEVEL, 2);
                List<N7mArea> city = n7mAreaDao.selectList(cityQuery);
                map.put(CITY, city);
            }
            if (level >= 3) {
                QueryWrapper<N7mArea> regionQuery = new QueryWrapper<>();
                regionQuery.eq(N7mArea.LEVEL, 3);
                List<N7mArea> region = n7mAreaDao.selectList(regionQuery);
                map.put(REGION, region);
            }
            return map;
        }

    }

    private AreaService areaService;

    public AreaService getAreaService() {
        if (null == this.areaService) {
            this.areaService = new AreaService();
        }
        return this.areaService;
    }

    // --- 字典 ----------------------------

    @Autowired
    private N7mDictionaryService n7mDictionaryService;

    @Autowired
    private N7mDictionaryDataService n7mDictionaryDataService;

    public class DictionaryService {

        private DictionaryService() {

        }

        public List<N7mDictionaryData> getDictionaryDataList(String identifier) {
            N7mDictionary dictionary = n7mDictionaryService.getOne(new QueryWrapper<N7mDictionary>()
                    .eq(N7mDictionary.IDENTIFIER, identifier));
            List<N7mDictionaryData> list = n7mDictionaryDataService.list(new QueryWrapper<N7mDictionaryData>()
                    .eq(N7mDictionaryData.DICTIONARY_ID, dictionary.getId()));
            if (list.size() > 0) {
                return list;
            }
            return null;
        }

    }

    private DictionaryService dictionaryService;

    public DictionaryService getDictionaryService() {
        if (null == this.dictionaryService) {
            this.dictionaryService = new DictionaryService();
        }
        return this.dictionaryService;
    }

}
