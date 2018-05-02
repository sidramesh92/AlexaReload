package com.hackathon.alexa.reload.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import java.util.Optional;

public class LaunchRequestHandler implements RequestHandler {
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(Predicates.requestType(LaunchRequest.class));
    }

    public Optional<Response> handle(HandlerInput handlerInput) {
        String speechText = "Welcome to the Alexa Skills Kit, you can say reload my gift card balance";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("ReloadGC", speechText)
                .withReprompt(speechText)
                .build();
    }
}
