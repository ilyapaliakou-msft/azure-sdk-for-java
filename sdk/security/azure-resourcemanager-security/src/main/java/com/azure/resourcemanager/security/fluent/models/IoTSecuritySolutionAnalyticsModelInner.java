// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.IoTSecurityAlertedDevice;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceAlert;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceRecommendation;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem;
import com.azure.resourcemanager.security.models.IoTSeverityMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Security analytics of your IoT Security solution. */
@Fluent
public final class IoTSecuritySolutionAnalyticsModelInner extends ProxyResource {
    /*
     * Security Solution  Aggregated Alert data
     */
    @JsonProperty(value = "properties")
    private IoTSecuritySolutionAnalyticsModelProperties innerProperties;

    /** Creates an instance of IoTSecuritySolutionAnalyticsModelInner class. */
    public IoTSecuritySolutionAnalyticsModelInner() {
    }

    /**
     * Get the innerProperties property: Security Solution Aggregated Alert data.
     *
     * @return the innerProperties value.
     */
    private IoTSecuritySolutionAnalyticsModelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the metrics property: Security analytics of your IoT Security solution.
     *
     * @return the metrics value.
     */
    public IoTSeverityMetrics metrics() {
        return this.innerProperties() == null ? null : this.innerProperties().metrics();
    }

    /**
     * Get the unhealthyDeviceCount property: Number of unhealthy devices within your IoT Security solution.
     *
     * @return the unhealthyDeviceCount value.
     */
    public Long unhealthyDeviceCount() {
        return this.innerProperties() == null ? null : this.innerProperties().unhealthyDeviceCount();
    }

    /**
     * Get the devicesMetrics property: List of device metrics by the aggregation date.
     *
     * @return the devicesMetrics value.
     */
    public List<IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem> devicesMetrics() {
        return this.innerProperties() == null ? null : this.innerProperties().devicesMetrics();
    }

    /**
     * Get the topAlertedDevices property: List of the 3 devices with the most alerts.
     *
     * @return the topAlertedDevices value.
     */
    public List<IoTSecurityAlertedDevice> topAlertedDevices() {
        return this.innerProperties() == null ? null : this.innerProperties().topAlertedDevices();
    }

    /**
     * Set the topAlertedDevices property: List of the 3 devices with the most alerts.
     *
     * @param topAlertedDevices the topAlertedDevices value to set.
     * @return the IoTSecuritySolutionAnalyticsModelInner object itself.
     */
    public IoTSecuritySolutionAnalyticsModelInner withTopAlertedDevices(
        List<IoTSecurityAlertedDevice> topAlertedDevices) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTSecuritySolutionAnalyticsModelProperties();
        }
        this.innerProperties().withTopAlertedDevices(topAlertedDevices);
        return this;
    }

    /**
     * Get the mostPrevalentDeviceAlerts property: List of the 3 most prevalent device alerts.
     *
     * @return the mostPrevalentDeviceAlerts value.
     */
    public List<IoTSecurityDeviceAlert> mostPrevalentDeviceAlerts() {
        return this.innerProperties() == null ? null : this.innerProperties().mostPrevalentDeviceAlerts();
    }

    /**
     * Set the mostPrevalentDeviceAlerts property: List of the 3 most prevalent device alerts.
     *
     * @param mostPrevalentDeviceAlerts the mostPrevalentDeviceAlerts value to set.
     * @return the IoTSecuritySolutionAnalyticsModelInner object itself.
     */
    public IoTSecuritySolutionAnalyticsModelInner withMostPrevalentDeviceAlerts(
        List<IoTSecurityDeviceAlert> mostPrevalentDeviceAlerts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTSecuritySolutionAnalyticsModelProperties();
        }
        this.innerProperties().withMostPrevalentDeviceAlerts(mostPrevalentDeviceAlerts);
        return this;
    }

    /**
     * Get the mostPrevalentDeviceRecommendations property: List of the 3 most prevalent device recommendations.
     *
     * @return the mostPrevalentDeviceRecommendations value.
     */
    public List<IoTSecurityDeviceRecommendation> mostPrevalentDeviceRecommendations() {
        return this.innerProperties() == null ? null : this.innerProperties().mostPrevalentDeviceRecommendations();
    }

    /**
     * Set the mostPrevalentDeviceRecommendations property: List of the 3 most prevalent device recommendations.
     *
     * @param mostPrevalentDeviceRecommendations the mostPrevalentDeviceRecommendations value to set.
     * @return the IoTSecuritySolutionAnalyticsModelInner object itself.
     */
    public IoTSecuritySolutionAnalyticsModelInner withMostPrevalentDeviceRecommendations(
        List<IoTSecurityDeviceRecommendation> mostPrevalentDeviceRecommendations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTSecuritySolutionAnalyticsModelProperties();
        }
        this.innerProperties().withMostPrevalentDeviceRecommendations(mostPrevalentDeviceRecommendations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
