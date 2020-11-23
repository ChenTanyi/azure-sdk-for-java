// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.AccessUriInner;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskInner;
import com.azure.resourcemanager.compute.generated.models.DiskUpdate;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;

/** An instance of this class provides access to all the operations defined in DisksClient. */
public interface DisksClient {
    /**
     * Creates or updates a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskInner>, DiskInner> beginCreateOrUpdate(
        String resourceGroupName, String diskName, DiskInner disk);

    /**
     * Creates or updates a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskInner>, DiskInner> beginCreateOrUpdate(
        String resourceGroupName, String diskName, DiskInner disk, Context context);

    /**
     * Creates or updates a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner createOrUpdate(String resourceGroupName, String diskName, DiskInner disk);

    /**
     * Creates or updates a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner createOrUpdate(String resourceGroupName, String diskName, DiskInner disk, Context context);

    /**
     * Updates (patches) a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskInner>, DiskInner> beginUpdate(
        String resourceGroupName, String diskName, DiskUpdate disk);

    /**
     * Updates (patches) a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk update resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskInner>, DiskInner> beginUpdate(
        String resourceGroupName, String diskName, DiskUpdate disk, Context context);

    /**
     * Updates (patches) a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner update(String resourceGroupName, String diskName, DiskUpdate disk);

    /**
     * Updates (patches) a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param disk Disk update resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner update(String resourceGroupName, String diskName, DiskUpdate disk, Context context);

    /**
     * Gets information about a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner getByResourceGroup(String resourceGroupName, String diskName);

    /**
     * Gets information about a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiskInner> getByResourceGroupWithResponse(String resourceGroupName, String diskName, Context context);

    /**
     * Deletes a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String diskName);

    /**
     * Deletes a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String diskName, Context context);

    /**
     * Deletes a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String diskName);

    /**
     * Deletes a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String diskName, Context context);

    /**
     * Lists all the disks under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the disks under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the disks under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskInner> list();

    /**
     * Lists all the disks under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Disks operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskInner> list(Context context);

    /**
     * Grants access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccessUriInner>, AccessUriInner> beginGrantAccess(
        String resourceGroupName, String diskName, GrantAccessData grantAccessData);

    /**
     * Grants access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccessUriInner>, AccessUriInner> beginGrantAccess(
        String resourceGroupName, String diskName, GrantAccessData grantAccessData, Context context);

    /**
     * Grants access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessUriInner grantAccess(String resourceGroupName, String diskName, GrantAccessData grantAccessData);

    /**
     * Grants access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param grantAccessData Data used for requesting a SAS.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a disk access SAS uri.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessUriInner grantAccess(
        String resourceGroupName, String diskName, GrantAccessData grantAccessData, Context context);

    /**
     * Revokes access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevokeAccess(String resourceGroupName, String diskName);

    /**
     * Revokes access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRevokeAccess(String resourceGroupName, String diskName, Context context);

    /**
     * Revokes access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revokeAccess(String resourceGroupName, String diskName);

    /**
     * Revokes access to a disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskName The name of the managed disk that is being created. The name can't be changed after the disk is
     *     created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void revokeAccess(String resourceGroupName, String diskName, Context context);
}
