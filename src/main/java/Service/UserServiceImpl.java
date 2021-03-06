package Service;

import Bean.User;

import Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserDao userDao;
    /*登录验证用户名密码是否匹配*/
    public User findPwdByUsername(String username){
        return  userDao.findPwdByUsername(username);
    }

    /*加载用户信息*/

    @Override
    public User findUserInf() {
        return userDao.findUserInf();
    }
}
