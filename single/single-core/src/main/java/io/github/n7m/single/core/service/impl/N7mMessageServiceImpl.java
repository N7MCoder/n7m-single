package io.github.n7m.single.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.n7m.single.core.dao.N7mMessageDao;
import io.github.n7m.single.core.model.N7mMessage;
import io.github.n7m.single.core.service.N7mMessageService;
import org.springframework.stereotype.Service;

@Service(value = "NunumaoMessageServiceImpl")
public class N7mMessageServiceImpl extends ServiceImpl<N7mMessageDao, N7mMessage> implements N7mMessageService {
}
