package java.com.daria.twitterapi;

import com.daria.twitterapi.TwitterResponse.TweetSearchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/twitter")
@RequiredArgsConstructor
public class TwitterController {
    private final TwitterService twitterService;

    @GetMapping("/search-tweet")
    public TweetSearchResponse searchTweet(
            TwitterRequest.TweetSearchRequest searchRequest
    ){
        return twitterService.searchTweet(searchRequest);
    }
}
