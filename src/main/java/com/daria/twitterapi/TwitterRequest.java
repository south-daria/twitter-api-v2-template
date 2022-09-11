package java.com.daria.twitterapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

public class TwitterRequest {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TweetSearchRequest {
        @NotNull
        String query;
    }
}
