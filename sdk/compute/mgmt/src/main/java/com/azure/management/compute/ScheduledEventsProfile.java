// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ScheduledEventsProfile model.
 */
@Fluent
public final class ScheduledEventsProfile {
    /*
     * The terminateNotificationProfile property.
     */
    @JsonProperty(value = "terminateNotificationProfile")
    private TerminateNotificationProfile terminateNotificationProfile;

    /**
     * Get the terminateNotificationProfile property: The
     * terminateNotificationProfile property.
     * 
     * @return the terminateNotificationProfile value.
     */
    public TerminateNotificationProfile terminateNotificationProfile() {
        return this.terminateNotificationProfile;
    }

    /**
     * Set the terminateNotificationProfile property: The
     * terminateNotificationProfile property.
     * 
     * @param terminateNotificationProfile the terminateNotificationProfile
     * value to set.
     * @return the ScheduledEventsProfile object itself.
     */
    public ScheduledEventsProfile withTerminateNotificationProfile(TerminateNotificationProfile terminateNotificationProfile) {
        this.terminateNotificationProfile = terminateNotificationProfile;
        return this;
    }
}