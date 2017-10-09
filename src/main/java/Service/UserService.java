package Service;

import Bean.User;

public interface UserService {

    /*登录验证用户名密码是否匹配*/
    User findPwdByUsername(String username);

    /*加载用户信息*/
    User findUserInf();
}

