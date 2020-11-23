// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ContainerServices. */
public interface ContainerServices {
    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    PagedIterable<ContainerService> list();

    /**
     * Gets a list of container services in the specified subscription. The operation returns properties of each
     * container service including state, orchestrator, number of masters and agents, and FQDNs of masters and agents.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription.
     */
    PagedIterable<ContainerService> list(Context context);

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    ContainerService getByResourceGroup(String resourceGroupName, String containerServiceName);

    /**
     * Gets the properties of the specified container service in the specified subscription and resource group. The
     * operation returns the properties including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container service in the specified subscription and resource group.
     */
    Response<ContainerService> getByResourceGroupWithResponse(
        String resourceGroupName, String containerServiceName, Context context);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String containerServiceName);

    /**
     * Deletes the specified container service in the specified subscription and resource group. The operation does not
     * delete other resources created as part of creating a container service, including storage accounts, VMs, and
     * availability sets. All the other resources created with the container service are part of the same resource group
     * and can be deleted individually.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerServiceName The name of the container service in the specified subscription and resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String containerServiceName, Context context);

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    PagedIterable<ContainerService> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of container services in the specified subscription and resource group. The operation returns
     * properties of each container service including state, orchestrator, number of masters and agents, and FQDNs of
     * masters and agents.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container services in the specified subscription and resource group.
     */
    PagedIterable<ContainerService> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Begins definition for a new ContainerService resource.
     *
     * @param name resource name.
     * @return the first stage of the new ContainerService definition.
     */
    ContainerService.DefinitionStages.Blank define(String name);
}
