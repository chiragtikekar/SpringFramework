package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.LoginVO;
import com.VO.RegVO;

@Repository
public class RegDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insert(LoginVO lg)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(lg);
		transaction.commit();
		session.close();
	}

	public void insert(RegVO v)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(v);
		transaction.commit();
		session.close();
	}

	public List search() {
        List searchList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();		
		Query q = session.createQuery("from RegVO");
		searchList = q.list();
		session.close();
		
		return searchList;
	}
	
	public void delete(RegVO crud)
	{
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(crud);
		transaction.commit();
		session.close();
	}
	
	public List edit(RegVO reg)
	{
        List searchList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();		
		Query q = session.createQuery("from RegVO where id="+reg.getId()+"");
		searchList = q.list();
		session.close();
		
		return searchList;
	}

}
