package repo;

import java.util.List;

import entity.Comment;
import entity.Feed;
import entity.User;

public interface FeedRepo {
	User askQuestion(Feed feed);

	List<Feed> getMyFeeds(String userId);

	List<Feed> searchFeeds(String keyword);
	
	Feed getQuestion(int fid);

	Feed submitComment(Comment comment);
}
