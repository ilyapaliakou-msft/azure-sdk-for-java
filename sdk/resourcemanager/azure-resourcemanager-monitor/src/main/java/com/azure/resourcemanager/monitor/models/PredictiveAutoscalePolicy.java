// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** The parameters for enabling predictive autoscale. */
@Fluent
public final class PredictiveAutoscalePolicy {
    /*
     * the predictive autoscale mode
     */
    @JsonProperty(value = "scaleMode", required = true)
    private PredictiveAutoscalePolicyScaleMode scaleMode;

    /*
     * the amount of time to specify by which instances are launched in advance. It must be between 1 minute and 60
     * minutes in ISO 8601 format.
     */
    @JsonProperty(value = "scaleLookAheadTime")
    private Duration scaleLookAheadTime;

    /**
     * Get the scaleMode property: the predictive autoscale mode.
     *
     * @return the scaleMode value.
     */
    public PredictiveAutoscalePolicyScaleMode scaleMode() {
        return this.scaleMode;
    }

    /**
     * Set the scaleMode property: the predictive autoscale mode.
     *
     * @param scaleMode the scaleMode value to set.
     * @return the PredictiveAutoscalePolicy object itself.
     */
    public PredictiveAutoscalePolicy withScaleMode(PredictiveAutoscalePolicyScaleMode scaleMode) {
        this.scaleMode = scaleMode;
        return this;
    }

    /**
     * Get the scaleLookAheadTime property: the amount of time to specify by which instances are launched in advance. It
     * must be between 1 minute and 60 minutes in ISO 8601 format.
     *
     * @return the scaleLookAheadTime value.
     */
    public Duration scaleLookAheadTime() {
        return this.scaleLookAheadTime;
    }

    /**
     * Set the scaleLookAheadTime property: the amount of time to specify by which instances are launched in advance. It
     * must be between 1 minute and 60 minutes in ISO 8601 format.
     *
     * @param scaleLookAheadTime the scaleLookAheadTime value to set.
     * @return the PredictiveAutoscalePolicy object itself.
     */
    public PredictiveAutoscalePolicy withScaleLookAheadTime(Duration scaleLookAheadTime) {
        this.scaleLookAheadTime = scaleLookAheadTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scaleMode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property scaleMode in model PredictiveAutoscalePolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PredictiveAutoscalePolicy.class);
}