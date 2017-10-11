/**
 * Copyright (C) 2017 Etaia AS (oss@hubrick.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hubrick.vertx.fcm.model.notification;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author marcus
 * @since 1.0.0
 */
public class IosNotification extends Notification {

    private String title;
    private String body;
    private String sound;
    private String badge;

    @JsonProperty("click_action")
    private String clickAction;

    @JsonProperty("body_loc_key")
    private String bodyLocKey;

    @JsonProperty("body_loc_args")
    private String bodyLocArgs;

    @JsonProperty("title_loc_key")
    private String titleLocKey;

    @JsonProperty("title_loc_args")
    private String titleLocArgs;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(final String body) {
        this.body = body;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(final String sound) {
        this.sound = sound;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(final String badge) {
        this.badge = badge;
    }

    public String getClickAction() {
        return clickAction;
    }

    public void setClickAction(final String clickAction) {
        this.clickAction = clickAction;
    }

    public String getBodyLocKey() {
        return bodyLocKey;
    }

    public void setBodyLocKey(final String bodyLocKey) {
        this.bodyLocKey = bodyLocKey;
    }

    public String getBodyLocArgs() {
        return bodyLocArgs;
    }

    public void setBodyLocArgs(final String bodyLocArgs) {
        this.bodyLocArgs = bodyLocArgs;
    }

    public String getTitleLocKey() {
        return titleLocKey;
    }

    public void setTitleLocKey(final String titleLocKey) {
        this.titleLocKey = titleLocKey;
    }

    public String getTitleLocArgs() {
        return titleLocArgs;
    }

    public void setTitleLocArgs(final String titleLocArgs) {
        this.titleLocArgs = titleLocArgs;
    }
}
