package Dao;
import Bean.User;
import org.springframework.stereotype.Repository;


public interface UserDao {
	 User findPwdByUsername(String username);
}
