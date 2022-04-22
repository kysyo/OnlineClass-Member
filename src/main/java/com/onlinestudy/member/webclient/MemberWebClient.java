package com.onlinestudy.member.webclient;

import com.onlinestudy.member.domain.Member;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class MemberWebClient {

    private final WebClient client;
    public MemberWebClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8080").build();
    }

}
