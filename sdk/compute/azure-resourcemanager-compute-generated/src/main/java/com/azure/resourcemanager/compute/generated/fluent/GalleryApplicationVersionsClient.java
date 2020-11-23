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
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryApplicationVersionInner;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationVersionUpdate;
import com.azure.resourcemanager.compute.generated.models.ReplicationStatusTypes;

/** An instance of this class provides access to all the operations defined in GalleryApplicationVersionsClient. */
public interface GalleryApplicationVersionsClient {
    /**
     * Create or update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be created.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be created. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryApplicationVersionInner>, GalleryApplicationVersionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionInner galleryApplicationVersion);

    /**
     * Create or update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be created.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be created. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryApplicationVersionInner>, GalleryApplicationVersionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionInner galleryApplicationVersion,
        Context context);

    /**
     * Create or update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be created.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be created. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryApplicationVersionInner createOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionInner galleryApplicationVersion);

    /**
     * Create or update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be created.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be created. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryApplicationVersionInner createOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionInner galleryApplicationVersion,
        Context context);

    /**
     * Update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be updated.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be updated. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryApplicationVersionInner>, GalleryApplicationVersionInner> beginUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionUpdate galleryApplicationVersion);

    /**
     * Update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be updated.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be updated. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryApplicationVersionInner>, GalleryApplicationVersionInner> beginUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionUpdate galleryApplicationVersion,
        Context context);

    /**
     * Update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be updated.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be updated. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryApplicationVersionInner update(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionUpdate galleryApplicationVersion);

    /**
     * Update a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is
     *     to be updated.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be updated. Needs to follow
     *     semantic version name pattern: The allowed characters are digit and period. Digits must be within the range
     *     of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;.
     * @param galleryApplicationVersion Specifies information about the gallery Application Version that you want to
     *     update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryApplicationVersionInner update(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        GalleryApplicationVersionUpdate galleryApplicationVersion,
        Context context);

    /**
     * Retrieves information about a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     *     resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryApplicationVersionInner get(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName);

    /**
     * Retrieves information about a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     *     resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be retrieved.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Application Version that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GalleryApplicationVersionInner> getWithResponse(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        ReplicationStatusTypes expand,
        Context context);

    /**
     * Delete a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     *     resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName);

    /**
     * Delete a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     *     resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        Context context);

    /**
     * Delete a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     *     resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName);

    /**
     * Delete a gallery Application Version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version
     *     resides.
     * @param galleryApplicationVersionName The name of the gallery Application Version to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String galleryName,
        String galleryApplicationName,
        String galleryApplicationVersionName,
        Context context);

    /**
     * List gallery Application Versions in a gallery Application Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the Shared Application Gallery Application Definition from which the
     *     Application Versions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Application version operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryApplicationVersionInner> listByGalleryApplication(
        String resourceGroupName, String galleryName, String galleryApplicationName);

    /**
     * List gallery Application Versions in a gallery Application Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides.
     * @param galleryApplicationName The name of the Shared Application Gallery Application Definition from which the
     *     Application Versions are to be listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Application version operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryApplicationVersionInner> listByGalleryApplication(
        String resourceGroupName, String galleryName, String galleryApplicationName, Context context);
}
