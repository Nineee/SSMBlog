package Dao;
import Bean.User;
import org.springframework.stereotype.Repository;


public interface UserDao {

	/*验证用户名密码是否匹配*/
	 User findPwdByUsername(String username);

	/*加载用户信息*/
	User findUserInf();
}
