package Service;

import Bean.User;

import Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserDao userDao;

    public User findPwdByUsername(String username){
        return  userDao.findPwdByUsername(username);
    }

}
