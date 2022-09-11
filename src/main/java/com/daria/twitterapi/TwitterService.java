package java.com.daria.twitterapi;

import com.daria.twitterapi.TwitterRequest.TweetSearchRequest;
import com.daria.twitterapi.TwitterResponse.TweetSearchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwitterService {
    public TweetSearchResponse searchTweet(TweetSearchRequest searchRequest) {
        return null;
    }
}
