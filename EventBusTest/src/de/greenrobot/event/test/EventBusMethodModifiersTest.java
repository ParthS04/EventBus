/*
 * Copyright (C) 2012 Markus Junginger, greenrobot (http://greenrobot.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.greenrobot.event.test;

/**
 * @author Markus Junginger, greenrobot
 */
public class EventBusMethodModifiersTest extends AbstractEventBusTest {

    public void testRegisterForEventTypeAndPost() throws InterruptedException {
        eventBus.register(this);
        String event = "Hello";
        eventBus.post(event);
        waitForEventCount(4, 1000);
    }

    public void onEvent(String event) {
        trackEvent(event);
    }

    public void onEventMainThread(String event) {
        trackEvent(event);
    }

    public void onEventBackgroundThread(String event) {
        trackEvent(event);
    }
    
    public void onEventAsync(String event) {
        trackEvent(event);
    }
}
