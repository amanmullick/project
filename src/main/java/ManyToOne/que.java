package ManyToOne;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class que {
	@Id
	private int id;
	private String question;
	@OneToMany
	private List<ans> answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<ans> getAnswer() {
		return answer;
	}
	public void setAnswer(List<ans> answer) {
		this.answer = answer;
	}
	
	
}
