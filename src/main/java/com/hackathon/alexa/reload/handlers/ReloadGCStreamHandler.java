package com.hackathon.alexa.reload.handlers;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class ReloadGCStreamHandler extends SkillStreamHandler {
    public ReloadGCStreamHandler(Skill skill) {
        super(getSkill());
    }

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(new CancelandStopIntentHandler(),
                new ReloadGCHandler(),
                new HelpIntentHandler(),
                new LaunchRequestHandler(),
                new SessionEndedRequestHandler()).build();
    }
}
