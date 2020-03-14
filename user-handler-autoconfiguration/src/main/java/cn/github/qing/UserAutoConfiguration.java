package cn.github.qing;

import cn.github.qing.handler.OtherHandler;
import cn.github.qing.handler.UserHandler;
import cn.github.qing.model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 在项目中使用了UserHandler类时，自动装配UserAutoConfiguration
@ConditionalOnClass(UserHandler.class)
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfiguration {

    // 将UserHandler对象放入IOC容器中
    @Bean
    public UserHandler userHandler(UserProperties userProperties) {
        User user = new User();
        user.setUserName(userProperties.getInitName());
        user.setMoney(userProperties.getInitMoney());
        return new UserHandler(user);
    }

    // 将OtherHandler对象放入IOC容器中，条件：在容器中miss了该Bean的时候创建
    @Bean
    @ConditionalOnMissingBean(OtherHandler.class)
    public OtherHandler otherHandler() {
        return new OtherHandler();
    }

}
