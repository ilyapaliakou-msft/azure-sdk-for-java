// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.storagecache.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.storagecache.fluent.models.RequiredAmlFilesystemSubnetsSizeInner;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemCheckSubnetErrorException;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemSubnetInfo;
import com.azure.resourcemanager.storagecache.models.RequiredAmlFilesystemSubnetsSizeInfo;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final StorageCacheManagementClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(StorageCacheManagementClientImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageCacheManagementClientResourceProviders to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageCacheManageme")
    public interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.StorageCache/checkAmlFSSubnets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
            value = AmlFilesystemCheckSubnetErrorException.class,
            code = {400})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> checkAmlFSSubnets(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") AmlFilesystemSubnetInfo amlFilesystemSubnetInfo,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.StorageCache/getRequiredAmlFSSubnetsSize")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RequiredAmlFilesystemSubnetsSizeInner>> getRequiredAmlFSSubnetsSize(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") RequiredAmlFilesystemSubnetsSizeInfo requiredAmlFilesystemSubnetsSizeInfo,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check that subnets will be valid for AML file system create calls.
     *
     * @param amlFilesystemSubnetInfo Information about the subnets to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws AmlFilesystemCheckSubnetErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> checkAmlFSSubnetsWithResponseAsync(AmlFilesystemSubnetInfo amlFilesystemSubnetInfo) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (amlFilesystemSubnetInfo != null) {
            amlFilesystemSubnetInfo.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkAmlFSSubnets(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            amlFilesystemSubnetInfo,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check that subnets will be valid for AML file system create calls.
     *
     * @param amlFilesystemSubnetInfo Information about the subnets to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws AmlFilesystemCheckSubnetErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> checkAmlFSSubnetsWithResponseAsync(
        AmlFilesystemSubnetInfo amlFilesystemSubnetInfo, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (amlFilesystemSubnetInfo != null) {
            amlFilesystemSubnetInfo.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkAmlFSSubnets(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                amlFilesystemSubnetInfo,
                accept,
                context);
    }

    /**
     * Check that subnets will be valid for AML file system create calls.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws AmlFilesystemCheckSubnetErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> checkAmlFSSubnetsAsync() {
        final AmlFilesystemSubnetInfo amlFilesystemSubnetInfo = null;
        return checkAmlFSSubnetsWithResponseAsync(amlFilesystemSubnetInfo).flatMap(ignored -> Mono.empty());
    }

    /**
     * Check that subnets will be valid for AML file system create calls.
     *
     * @param amlFilesystemSubnetInfo Information about the subnets to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws AmlFilesystemCheckSubnetErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> checkAmlFSSubnetsWithResponse(
        AmlFilesystemSubnetInfo amlFilesystemSubnetInfo, Context context) {
        return checkAmlFSSubnetsWithResponseAsync(amlFilesystemSubnetInfo, context).block();
    }

    /**
     * Check that subnets will be valid for AML file system create calls.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws AmlFilesystemCheckSubnetErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void checkAmlFSSubnets() {
        final AmlFilesystemSubnetInfo amlFilesystemSubnetInfo = null;
        checkAmlFSSubnetsWithResponse(amlFilesystemSubnetInfo, Context.NONE);
    }

    /**
     * Get the number of available IP addresses needed for the AML file system information provided.
     *
     * @param requiredAmlFilesystemSubnetsSizeInfo Information to determine the number of available IPs a subnet will
     *     need to host the AML file system.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of available IP addresses needed for the AML file system information provided along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RequiredAmlFilesystemSubnetsSizeInner>> getRequiredAmlFSSubnetsSizeWithResponseAsync(
        RequiredAmlFilesystemSubnetsSizeInfo requiredAmlFilesystemSubnetsSizeInfo) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (requiredAmlFilesystemSubnetsSizeInfo != null) {
            requiredAmlFilesystemSubnetsSizeInfo.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getRequiredAmlFSSubnetsSize(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            requiredAmlFilesystemSubnetsSizeInfo,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the number of available IP addresses needed for the AML file system information provided.
     *
     * @param requiredAmlFilesystemSubnetsSizeInfo Information to determine the number of available IPs a subnet will
     *     need to host the AML file system.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of available IP addresses needed for the AML file system information provided along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RequiredAmlFilesystemSubnetsSizeInner>> getRequiredAmlFSSubnetsSizeWithResponseAsync(
        RequiredAmlFilesystemSubnetsSizeInfo requiredAmlFilesystemSubnetsSizeInfo, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (requiredAmlFilesystemSubnetsSizeInfo != null) {
            requiredAmlFilesystemSubnetsSizeInfo.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getRequiredAmlFSSubnetsSize(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                requiredAmlFilesystemSubnetsSizeInfo,
                accept,
                context);
    }

    /**
     * Get the number of available IP addresses needed for the AML file system information provided.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of available IP addresses needed for the AML file system information provided on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RequiredAmlFilesystemSubnetsSizeInner> getRequiredAmlFSSubnetsSizeAsync() {
        final RequiredAmlFilesystemSubnetsSizeInfo requiredAmlFilesystemSubnetsSizeInfo = null;
        return getRequiredAmlFSSubnetsSizeWithResponseAsync(requiredAmlFilesystemSubnetsSizeInfo)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the number of available IP addresses needed for the AML file system information provided.
     *
     * @param requiredAmlFilesystemSubnetsSizeInfo Information to determine the number of available IPs a subnet will
     *     need to host the AML file system.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of available IP addresses needed for the AML file system information provided along with
     *     {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RequiredAmlFilesystemSubnetsSizeInner> getRequiredAmlFSSubnetsSizeWithResponse(
        RequiredAmlFilesystemSubnetsSizeInfo requiredAmlFilesystemSubnetsSizeInfo, Context context) {
        return getRequiredAmlFSSubnetsSizeWithResponseAsync(requiredAmlFilesystemSubnetsSizeInfo, context).block();
    }

    /**
     * Get the number of available IP addresses needed for the AML file system information provided.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the number of available IP addresses needed for the AML file system information provided.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequiredAmlFilesystemSubnetsSizeInner getRequiredAmlFSSubnetsSize() {
        final RequiredAmlFilesystemSubnetsSizeInfo requiredAmlFilesystemSubnetsSizeInfo = null;
        return getRequiredAmlFSSubnetsSizeWithResponse(requiredAmlFilesystemSubnetsSizeInfo, Context.NONE).getValue();
    }
}
