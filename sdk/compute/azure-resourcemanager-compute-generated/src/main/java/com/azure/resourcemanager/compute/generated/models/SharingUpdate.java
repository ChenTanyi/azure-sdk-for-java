// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.generated.fluent.models.SharingUpdateInner;
import java.util.List;

/** An immutable client-side representation of SharingUpdate. */
@Immutable
public interface SharingUpdate {
    /**
     * Gets the operationType property: This property allows you to specify the operation type of gallery sharing
     * update. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Add** &lt;br&gt;&lt;br&gt; **Remove**
     * &lt;br&gt;&lt;br&gt; **Reset**.
     *
     * @return the operationType value.
     */
    SharingUpdateOperationTypes operationType();

    /**
     * Gets the groups property: A list of sharing profile groups.
     *
     * @return the groups value.
     */
    List<SharingProfileGroup> groups();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.SharingUpdateInner object.
     *
     * @return the inner object.
     */
    SharingUpdateInner innerModel();
}
