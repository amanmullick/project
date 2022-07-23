package ManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {
	public static void main(String args[])
	{
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	
	que q1 = new que();
	q1.setId(1);
	q1.setQuestion("what is java");
	
	
	ans a1 = new ans();
	a1.setId(1);
	a1.setAnswer("it is pl");
	
	ans a2 = new ans();
	a2.setId(2);
	a2.setAnswer("it supports oops");
	
	List <ans> list = new ArrayList<ans>();
	list.add(a1);
	list.add(a2);
	
	q1.setAnswer(list);
	a1.setQuestion(q1);
	a2.setQuestion(q1);
	
	session.save(q1);
	session.save(a1);
	session.save(a2);
	
	
	
	tx.commit();
	session.close();
	sf.close();
	
	
	
}
}