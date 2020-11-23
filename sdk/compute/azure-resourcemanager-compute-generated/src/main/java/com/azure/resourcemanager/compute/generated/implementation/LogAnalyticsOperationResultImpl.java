// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.LogAnalyticsOperationResultInner;
import com.azure.resourcemanager.compute.generated.models.LogAnalyticsOperationResult;
import com.azure.resourcemanager.compute.generated.models.LogAnalyticsOutput;

public final class LogAnalyticsOperationResultImpl implements LogAnalyticsOperationResult {
    private LogAnalyticsOperationResultInner innerObject;

    private final ComputeManager serviceManager;

    public LogAnalyticsOperationResultImpl(
        LogAnalyticsOperationResultInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public LogAnalyticsOutput properties() {
        return this.innerModel().properties();
    }

    public LogAnalyticsOperationResultInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
