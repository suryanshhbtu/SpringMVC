package springmvc.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public int save(User user) {
		int cnt = (Integer)hibernateTemplate.save(user);
		return cnt;
	}

}
