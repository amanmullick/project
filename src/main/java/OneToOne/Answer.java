package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
			
	@Id
	private int aid;
	private String ans;
	@OneToOne
	private Question que;
	
	
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	
}
