package com.hackathon.alexa.reload.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import java.util.Optional;

public class ReloadGCHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(Predicates.intentName("reloadRequestIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        String speechText = "Your gift card balance has been updated";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("ReloadGC", speechText)
                .build();
    }
}
