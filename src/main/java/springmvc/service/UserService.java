package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDAO;
import springmvc.dao.UserDAOImpl;
import springmvc.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public int createUser(User user) {
		return userDAO.save(user);
	}
}
