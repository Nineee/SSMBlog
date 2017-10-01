package Service;

import Bean.User;

public interface UserService {

    User findPwdByUsername(String username);
}
