package io.github.n7m.single.core.websocket.topic;
// +----------------------------------------------------------------------
// | 官方网站: www.365d1.com
// +----------------------------------------------------------------------
// | 功能描述: 
// +----------------------------------------------------------------------
// | 时　　间: 2021/12/1
// +----------------------------------------------------------------------
// | 代码创建: 朱荻 <292018748@qq.com>
// +----------------------------------------------------------------------
// | 版本信息: V1.0.0
// +----------------------------------------------------------------------
// | 代码修改:（修改人 - 修改时间）
// +----------------------------------------------------------------------


import io.github.n7m.single.core.dao.N7mMessageDao;
import io.github.n7m.single.core.model.N7mMessage;
import io.github.n7m.single.core.sql.SQLDatetime;
import io.github.n7m.single.core.websocket.entity.WebSocketTopic;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class WebSocketSender {

    @Autowired
    private N7mMessageDao n7mMessageDao;

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Data
    private class Message {
        private String id;
        private String name;
        private String intro;
    }

    public void sendBroadcast(String name, String intro, String content) {
        N7mMessage n7mMessage = new N7mMessage();
        n7mMessage.setType(0);
        n7mMessage.setName(name);
        n7mMessage.setIntro(intro);
        n7mMessage.setContent(content);
        n7mMessage.setIsRead(0);
        n7mMessage.setCreateTime(SQLDatetime.time());
        n7mMessage.setStatus(1);
        int flag = n7mMessageDao.insert(n7mMessage);
        if (flag > 0) {
            simpMessagingTemplate.convertAndSend(WebSocketTopic.TOPIC_BROADCAST, new Message() {{
                setId(n7mMessage.getId());
                setName(name);
                setIntro(intro);
            }});
        }
    }

    public void sendUser(String uid, String name, String intro, String content) {
        N7mMessage n7mMessage = new N7mMessage();
        n7mMessage.setUserId(uid);
        n7mMessage.setType(1);
        n7mMessage.setName(name);
        n7mMessage.setIntro(intro);
        n7mMessage.setContent(content);
        n7mMessage.setIsRead(0);
        n7mMessage.setCreateTime(SQLDatetime.time());
        n7mMessage.setStatus(1);
        int flag = n7mMessageDao.insert(n7mMessage);
        if (flag > 0) {
            simpMessagingTemplate.convertAndSendToUser(uid, WebSocketTopic.TOPIC_SINGLE, new Message() {{
                setId(n7mMessage.getId());
                setName(name);
                setIntro(intro);
            }});
        }
    }

}
