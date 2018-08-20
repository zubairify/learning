package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="comments")
@SequenceGenerator(name="sc", sequenceName="seq_cmnt")
public class Comment {
	@Id
	@GeneratedValue(generator="sc")
	private int cmntId;
	private String response;
	@Temporal(TemporalType.TIMESTAMP)
	private Date cmntTime;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="feedId")
	private Feed feed;
	
	public int getCmntId() {
		return cmntId;
	}
	public void setCmntId(int cmntId) {
		this.cmntId = cmntId;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public Date getCmntTime() {
		return cmntTime;
	}
	public void setCmntTime(Date cmntTime) {
		this.cmntTime = cmntTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Feed getFeed() {
		return feed;
	}
	public void setFeed(Feed feed) {
		this.feed = feed;
	}
}
