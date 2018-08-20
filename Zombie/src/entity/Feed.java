package entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="feeds")
@SequenceGenerator(name="sf", sequenceName="seq_feed")
public class Feed {
	@Id
	@GeneratedValue(generator="sf")
	private int feedId;
	private String query;
	@Temporal(TemporalType.TIMESTAMP)
	private Date feedTime;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	@OneToMany(mappedBy="feed", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Set<Comment> comments;
	
	@Formula("(select count(*) from comments c where c.feedId=feedId)")
	private int totalCmnts;
	
	public void setTotalCmnts(int totalCmnts) {
		this.totalCmnts = totalCmnts;
	}
	public int getTotalCmnts() {
		return totalCmnts;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public Date getFeedTime() {
		return feedTime;
	}
	public void setFeedTime(Date feedTime) {
		this.feedTime = feedTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
}
