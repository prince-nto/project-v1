package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCompleted;

public class TweetEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long tweetId;
	private String body;
	private DateTimeAtCompleted dateCreated;
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public void setDateCreated(DateTimeAtCompleted dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	public long getTweetId() {
		return tweetId;
	}
	
	public String getBody() {
		return body;
	}
	
	public DateTimeAtCompleted getDateCreated() {
		return dateCreated;
	}
}
