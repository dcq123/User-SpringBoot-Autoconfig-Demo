package cn.github.qing;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = UserProperties.MYBATIS_PREFIX)
public class UserProperties {
    public static final String MYBATIS_PREFIX = "user";
    String initName;
    Integer initMoney;
    public String getInitName() {
        return initName;
    }
    public void setInitName(String initName) {
        this.initName = initName;
    }

    public Integer getInitMoney() {
        return initMoney;
    }

    public void setInitMoney(Integer initMoney) {
        this.initMoney = initMoney;
    }
}
