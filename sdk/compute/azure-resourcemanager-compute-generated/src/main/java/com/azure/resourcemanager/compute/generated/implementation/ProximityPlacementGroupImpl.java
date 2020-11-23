// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.ProximityPlacementGroupInner;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroup;
import com.azure.resourcemanager.compute.generated.models.ProximityPlacementGroupType;
import com.azure.resourcemanager.compute.generated.models.SubResourceWithColocationStatus;
import com.azure.resourcemanager.compute.generated.models.UpdateResource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ProximityPlacementGroupImpl
    implements ProximityPlacementGroup, ProximityPlacementGroup.Definition, ProximityPlacementGroup.Update {
    private ProximityPlacementGroupInner innerObject;

    private final ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return null;
        }
    }

    public ProximityPlacementGroupType proximityPlacementGroupType() {
        return this.innerModel().proximityPlacementGroupType();
    }

    public List<SubResourceWithColocationStatus> virtualMachines() {
        List<SubResourceWithColocationStatus> inner = this.innerModel().virtualMachines();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<SubResourceWithColocationStatus> virtualMachineScaleSets() {
        List<SubResourceWithColocationStatus> inner = this.innerModel().virtualMachineScaleSets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<SubResourceWithColocationStatus> availabilitySets() {
        List<SubResourceWithColocationStatus> inner = this.innerModel().availabilitySets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public InstanceViewStatus colocationStatus() {
        return this.innerModel().colocationStatus();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ProximityPlacementGroupInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String proximityPlacementGroupName;

    private UpdateResource updateParameters;

    public ProximityPlacementGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ProximityPlacementGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProximityPlacementGroups()
                .createOrUpdateWithResponse(resourceGroupName, proximityPlacementGroupName, innerObject, Context.NONE)
                .getValue();
        return this;
    }

    public ProximityPlacementGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProximityPlacementGroups()
                .createOrUpdateWithResponse(resourceGroupName, proximityPlacementGroupName, innerObject, context)
                .getValue();
        return this;
    }

    public ProximityPlacementGroupImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new ProximityPlacementGroupInner();
        this.serviceManager = serviceManager;
        this.proximityPlacementGroupName = name;
    }

    public ProximityPlacementGroupImpl update() {
        this.updateParameters = new UpdateResource();
        return this;
    }

    public ProximityPlacementGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProximityPlacementGroups()
                .updateWithResponse(resourceGroupName, proximityPlacementGroupName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ProximityPlacementGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProximityPlacementGroups()
                .updateWithResponse(resourceGroupName, proximityPlacementGroupName, updateParameters, context)
                .getValue();
        return this;
    }

    public ProximityPlacementGroupImpl(ProximityPlacementGroupInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.proximityPlacementGroupName = Utils.getValueFromIdByName(innerObject.id(), "proximityPlacementGroups");
    }

    public ProximityPlacementGroup refresh() {
        String refreshIncludeColocationStatus = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProximityPlacementGroups()
                .getByResourceGroupWithResponse(
                    resourceGroupName, proximityPlacementGroupName, refreshIncludeColocationStatus, Context.NONE)
                .getValue();
        return this;
    }

    public ProximityPlacementGroup refresh(Context context) {
        String refreshIncludeColocationStatus = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProximityPlacementGroups()
                .getByResourceGroupWithResponse(
                    resourceGroupName, proximityPlacementGroupName, refreshIncludeColocationStatus, context)
                .getValue();
        return this;
    }

    public ProximityPlacementGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ProximityPlacementGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ProximityPlacementGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ProximityPlacementGroupImpl withProximityPlacementGroupType(
        ProximityPlacementGroupType proximityPlacementGroupType) {
        this.innerModel().withProximityPlacementGroupType(proximityPlacementGroupType);
        return this;
    }

    public ProximityPlacementGroupImpl withColocationStatus(InstanceViewStatus colocationStatus) {
        this.innerModel().withColocationStatus(colocationStatus);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
