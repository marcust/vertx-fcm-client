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
package com.hubrick.vertx.fcm.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubrick.vertx.fcm.model.common.DeviceGroupOperation;

import java.util.Arrays;
import java.util.List;

/**
 * @author marcus
 * @since 1.0.0
 */
public class DeviceGroupModifyRequest extends AbstractDeviceGroupRequest {

    @JsonProperty("notification_key")
    private String notificationKey;


    public DeviceGroupModifyRequest(final DeviceGroupOperation operation,
                                    final String notificationKeyName,
                                    final String notificationKey,
                                    final List<String> registrationIds) {
        super(operation, notificationKeyName, registrationIds);

        this.notificationKey = notificationKey;
    }

    public DeviceGroupModifyRequest(final DeviceGroupOperation operation,
                                    final String notificationKeyName,
                                    final String notificationKey,
                                    final String... registrationIds) {
        this(operation, notificationKeyName, notificationKey, Arrays.asList(registrationIds));
    }

    public String getNotificationKey() {
        return notificationKey;
    }
}
