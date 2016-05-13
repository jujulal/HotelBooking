package org.mum.hotel.domain;

import org.hibernate.SessionFactory;

public class UserDao {

	SessionFactory sessionFactory;
	
	public UserDao(){
		
	}
	public UserDao(SessionFactory sessionFactory){
		
		this.sessionFactory=sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
