package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernateCore.Student;

@Entity
public class Question {
	
	private String que;
	@Id
	private int qid;
	@OneToOne
	private Answer ans;
	
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	

	
	}

