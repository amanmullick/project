package ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ans {
	@Id
	private int id;
	private String answer;
	@ManyToOne
	private que question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public que getQuestion() {
		return question;
	}
	public void setQuestion(que question) {
		this.question = question;
	}
	
	
	
}
