package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q1 = new Question();
		q1.setQid(1);
		q1.setQue("what is java");
		
		
		Answer a1 =new Answer();
		a1.setAid(10);
		a1.setAns("it is pl");

		q1.setAns(a1);
		a1.setQue(q1);

		
		session.save(q1);
		session.save(a1);
		
		
		tx.commit();
		session.close();
		sf.close();
		
	}
}
