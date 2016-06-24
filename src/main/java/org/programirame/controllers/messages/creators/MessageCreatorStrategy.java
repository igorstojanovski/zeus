package org.programirame.controllers.messages.creators;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public enum MessageCreatorStrategy implements MessageCreatorChooser {
    EMAIL {
        @Override
        @Bean
        public MessageCreator getMessageCreator() {
            return new EmailMessageCreator();
        }
    }
}
