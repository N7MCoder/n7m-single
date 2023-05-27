package io.github.n7m.single.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.n7m.single.core.dao.N7mFileDao;
import io.github.n7m.single.core.model.N7mFile;
import io.github.n7m.single.core.service.N7mFileService;
import org.springframework.stereotype.Service;

@Service
public class N7mFileServiceImpl extends ServiceImpl<N7mFileDao, N7mFile> implements N7mFileService {
    
}