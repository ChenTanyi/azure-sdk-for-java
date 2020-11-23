// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.compute.generated.models.ResourceSku;
import com.azure.resourcemanager.compute.generated.models.ResourceSkuCapabilities;
import com.azure.resourcemanager.compute.generated.models.ResourceSkuCapacity;
import com.azure.resourcemanager.compute.generated.models.ResourceSkuCosts;
import com.azure.resourcemanager.compute.generated.models.ResourceSkuLocationInfo;
import com.azure.resourcemanager.compute.generated.models.ResourceSkuRestrictions;
import java.util.Collections;
import java.util.List;

public final class ResourceSkuImpl implements ResourceSku {
    private ResourceSkuInner innerObject;

    private final ComputeManager serviceManager;

    public ResourceSkuImpl(ResourceSkuInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String tier() {
        return this.innerModel().tier();
    }

    public String size() {
        return this.innerModel().size();
    }

    public String family() {
        return this.innerModel().family();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public ResourceSkuCapacity capacity() {
        return this.innerModel().capacity();
    }

    public List<String> locations() {
        List<String> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ResourceSkuLocationInfo> locationInfo() {
        List<ResourceSkuLocationInfo> inner = this.innerModel().locationInfo();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<String> apiVersions() {
        List<String> inner = this.innerModel().apiVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ResourceSkuCosts> costs() {
        List<ResourceSkuCosts> inner = this.innerModel().costs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ResourceSkuCapabilities> capabilities() {
        List<ResourceSkuCapabilities> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public List<ResourceSkuRestrictions> restrictions() {
        List<ResourceSkuRestrictions> inner = this.innerModel().restrictions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return null;
        }
    }

    public ResourceSkuInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
