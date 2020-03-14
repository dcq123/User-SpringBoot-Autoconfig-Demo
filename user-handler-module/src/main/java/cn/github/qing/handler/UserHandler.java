package cn.github.qing.handler;

import cn.github.qing.model.User;

public class UserHandler {
    private User user;
    public UserHandler(User user) {
        this.user = user;
    }

    public User deduction(Integer money) {
        user.setMoney(user.getMoney() - money);
        System.out.println("deduction---->user money do deduction ...");
        return user;
    }
}
