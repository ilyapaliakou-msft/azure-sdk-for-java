// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.route.implementation.models.RouteMatrixResultResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Matrix result object. */
@Immutable
public final class RouteMatrix {
    /*
     * StatusCode property for the current cell in the input matrix.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer statusCode;

    /*
     * Response object of the current cell in the input matrix.
     */
    @JsonProperty(value = "response", access = JsonProperty.Access.WRITE_ONLY)
    private RouteMatrixResultResponse response;

    /**
     * Get the statusCode property: StatusCode property for the current cell in the input matrix.
     *
     * @return the statusCode value.
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * Returns a {@link RouteLegSummary} summarizing this route section.
     *
     * @return a {@code RouteLegSummary} with the summary of this route leg.
     */
    public RouteLegSummary getSummary() {
        return this.response.getSummary();
    }
}