package com.onlinestudy.member.router;

import com.onlinestudy.member.handler.MemberHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration(proxyBeanMethods = false)
public class MemberRouter {

    MemberHandler memberHandler = new MemberHandler();

    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions
                .route(POST("/signup"), memberHandler::signUpHandler)
                .andRoute(POST("/login"), memberHandler::loginHandler)
                .andRoute(POST("/setuplecture"), memberHandler::setUpLectureHandler)
                .andRoute(POST("/editinfo"), memberHandler::editMemberInfoHandler)
                .andRoute(POST("/getinfo"), memberHandler::getMemberInfoHandler)
                ;
    }
}
