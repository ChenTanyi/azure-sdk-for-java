// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.network.TagsObject;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PublicIPPrefixes.
 */
public final class PublicIPPrefixesInner implements InnerSupportsGet<PublicIPPrefixInner>, InnerSupportsListing<PublicIPPrefixInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private PublicIPPrefixesService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of PublicIPPrefixesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public PublicIPPrefixesInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(PublicIPPrefixesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientPublicIPPrefixes to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientPublicIPPrefixes")
    private interface PublicIPPrefixesService {
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIpPrefixName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("publicIpPrefixName") String publicIpPrefixName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIpPrefixName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PublicIPPrefixInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("publicIpPrefixName") String publicIpPrefixName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIpPrefixName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("publicIpPrefixName") String publicIpPrefixName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") PublicIPPrefixInner parameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIpPrefixName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> updateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("publicIpPrefixName") String publicIpPrefixName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/publicIPPrefixes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PublicIPPrefixListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PublicIPPrefixListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIpPrefixName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("publicIpPrefixName") String publicIpPrefixName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIpPrefixName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PublicIPPrefixInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("publicIpPrefixName") String publicIpPrefixName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") PublicIPPrefixInner parameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPPrefixes/{publicIpPrefixName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PublicIPPrefixInner>> beginUpdateTags(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("publicIpPrefixName") String publicIpPrefixName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PublicIPPrefixListResultInner>> listAllNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PublicIPPrefixListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Deletes the specified public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String publicIpPrefixName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), resourceGroupName, publicIpPrefixName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String publicIpPrefixName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, publicIpPrefixName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String publicIpPrefixName) {
        deleteAsync(resourceGroupName, publicIpPrefixName).block();
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PublicIPPrefixInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String publicIpPrefixName, String expand) {
        final String apiVersion = "2019-06-01";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, publicIpPrefixName, this.client.getSubscriptionId(), expand, apiVersion);
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIPPrefixInner> getByResourceGroupAsync(String resourceGroupName, String publicIpPrefixName, String expand) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, publicIpPrefixName, expand)
            .flatMap((SimpleResponse<PublicIPPrefixInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIPPrefixInner> getByResourceGroupAsync(String resourceGroupName, String publicIpPrefixName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupWithResponseAsync(resourceGroupName, publicIpPrefixName, expand)
            .flatMap((SimpleResponse<PublicIPPrefixInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PublicIPPrefixInner getByResourceGroup(String resourceGroupName, String publicIpPrefixName, String expand) {
        return getByResourceGroupAsync(resourceGroupName, publicIpPrefixName, expand).block();
    }

    /**
     * Gets the specified public IP prefix in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PublicIPPrefixInner getByResourceGroup(String resourceGroupName, String publicIpPrefixName) {
        final String expand = null;
        final String apiVersion = "2019-06-01";
        return getByResourceGroupAsync(resourceGroupName, publicIpPrefixName, expand).block();
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String publicIpPrefixName, PublicIPPrefixInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, publicIpPrefixName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIPPrefixInner> createOrUpdateAsync(String resourceGroupName, String publicIpPrefixName, PublicIPPrefixInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, publicIpPrefixName, parameters);
        return client.<PublicIPPrefixInner, PublicIPPrefixInner>getLroResultAsync(response, client.getHttpPipeline(), PublicIPPrefixInner.class, PublicIPPrefixInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PublicIPPrefixInner createOrUpdate(String resourceGroupName, String publicIpPrefixName, PublicIPPrefixInner parameters) {
        return createOrUpdateAsync(resourceGroupName, publicIpPrefixName, parameters).block();
    }

    /**
     * Updates public IP prefix tags.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> updateTagsWithResponseAsync(String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.updateTags(this.client.getHost(), resourceGroupName, publicIpPrefixName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates public IP prefix tags.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIPPrefixInner> updateTagsAsync(String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = updateTagsWithResponseAsync(resourceGroupName, publicIpPrefixName, tags);
        return client.<PublicIPPrefixInner, PublicIPPrefixInner>getLroResultAsync(response, client.getHttpPipeline(), PublicIPPrefixInner.class, PublicIPPrefixInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Updates public IP prefix tags.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PublicIPPrefixInner updateTags(String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, publicIpPrefixName, tags).block();
    }

    /**
     * Gets all the public IP prefixes in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PublicIPPrefixInner>> listSinglePageAsync() {
        final String apiVersion = "2019-06-01";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all the public IP prefixes in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PublicIPPrefixInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listAllNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the public IP prefixes in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PublicIPPrefixInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets all public IP prefixes in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PublicIPPrefixInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-06-01";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all public IP prefixes in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PublicIPPrefixInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all public IP prefixes in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PublicIPPrefixInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Deletes the specified public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String publicIpPrefixName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, publicIpPrefixName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String publicIpPrefixName) {
        return beginDeleteWithResponseAsync(resourceGroupName, publicIpPrefixName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String publicIpPrefixName) {
        beginDeleteAsync(resourceGroupName, publicIpPrefixName).block();
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PublicIPPrefixInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String publicIpPrefixName, PublicIPPrefixInner parameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, publicIpPrefixName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIPPrefixInner> beginCreateOrUpdateAsync(String resourceGroupName, String publicIpPrefixName, PublicIPPrefixInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, publicIpPrefixName, parameters)
            .flatMap((SimpleResponse<PublicIPPrefixInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a static or dynamic public IP prefix.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param parameters Public IP prefix resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PublicIPPrefixInner beginCreateOrUpdate(String resourceGroupName, String publicIpPrefixName, PublicIPPrefixInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, publicIpPrefixName, parameters).block();
    }

    /**
     * Updates public IP prefix tags.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PublicIPPrefixInner>> beginUpdateTagsWithResponseAsync(String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        final String apiVersion = "2019-06-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.beginUpdateTags(this.client.getHost(), resourceGroupName, publicIpPrefixName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates public IP prefix tags.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublicIPPrefixInner> beginUpdateTagsAsync(String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        return beginUpdateTagsWithResponseAsync(resourceGroupName, publicIpPrefixName, tags)
            .flatMap((SimpleResponse<PublicIPPrefixInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates public IP prefix tags.
     * 
     * @param resourceGroupName 
     * @param publicIpPrefixName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PublicIPPrefixInner beginUpdateTags(String resourceGroupName, String publicIpPrefixName, Map<String, String> tags) {
        return beginUpdateTagsAsync(resourceGroupName, publicIpPrefixName, tags).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PublicIPPrefixInner>> listAllNextSinglePageAsync(String nextLink) {
        return service.listAllNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PublicIPPrefixInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}