/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package main.java.lieblingsfarbe.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Optional;
import main.java.lieblingsfarbe.PhrasesAndConstants;

import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {

    static final Logger logger = LogManager.getLogger(LaunchRequestHandler.class);

    @Override
    public boolean canHandle(HandlerInput input) {

        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        logger.info("LaunchRequestHandler\n");
        logger.error("LaunchRequestHandler\n");
        return input.getResponseBuilder()
                .withSimpleCard(PhrasesAndConstants.CardTitle, PhrasesAndConstants.WELCOME)
                .withSpeech(PhrasesAndConstants.WELCOME)
                .withReprompt(PhrasesAndConstants.WELCOME_REPROMT)
                .build();
    }
}
