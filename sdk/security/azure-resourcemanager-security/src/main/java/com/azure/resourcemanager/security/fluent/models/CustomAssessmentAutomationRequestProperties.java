// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.SeverityEnum;
import com.azure.resourcemanager.security.models.SupportedCloudEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

/** describes the Custom Assessment Automation properties. */
@Fluent
public final class CustomAssessmentAutomationRequestProperties {
    /*
     * Base 64 encoded KQL query representing the assessment automation results required.
     */
    @JsonProperty(value = "compressedQuery")
    private String compressedQuery;

    /*
     * Relevant cloud for the custom assessment automation.
     */
    @JsonProperty(value = "supportedCloud")
    private SupportedCloudEnum supportedCloud = SupportedCloudEnum.AWS;

    /*
     * The severity to relate to the assessments generated by this assessment automation.
     */
    @JsonProperty(value = "severity")
    private SeverityEnum severity = SeverityEnum.LOW;

    /*
     * The display name of the assessments generated by this assessment automation.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description to relate to the assessments generated by this assessment automation.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The remediation description to relate to the assessments generated by this assessment automation.
     */
    @JsonProperty(value = "remediationDescription")
    private String remediationDescription;

    /**
     * Get the compressedQuery property: Base 64 encoded KQL query representing the assessment automation results
     * required.
     *
     * @return the compressedQuery value.
     */
    public String compressedQuery() {
        return this.compressedQuery;
    }

    /**
     * Set the compressedQuery property: Base 64 encoded KQL query representing the assessment automation results
     * required.
     *
     * @param compressedQuery the compressedQuery value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withCompressedQuery(String compressedQuery) {
        this.compressedQuery = compressedQuery;
        return this;
    }

    /**
     * Get the supportedCloud property: Relevant cloud for the custom assessment automation.
     *
     * @return the supportedCloud value.
     */
    public SupportedCloudEnum supportedCloud() {
        return this.supportedCloud;
    }

    /**
     * Set the supportedCloud property: Relevant cloud for the custom assessment automation.
     *
     * @param supportedCloud the supportedCloud value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withSupportedCloud(SupportedCloudEnum supportedCloud) {
        this.supportedCloud = supportedCloud;
        return this;
    }

    /**
     * Get the severity property: The severity to relate to the assessments generated by this assessment automation.
     *
     * @return the severity value.
     */
    public SeverityEnum severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity to relate to the assessments generated by this assessment automation.
     *
     * @param severity the severity value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the displayName property: The display name of the assessments generated by this assessment automation.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the assessments generated by this assessment automation.
     *
     * @param displayName the displayName value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description to relate to the assessments generated by this assessment
     * automation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description to relate to the assessments generated by this assessment
     * automation.
     *
     * @param description the description value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     *
     * @return the remediationDescription value.
     */
    public String remediationDescription() {
        return this.remediationDescription;
    }

    /**
     * Set the remediationDescription property: The remediation description to relate to the assessments generated by
     * this assessment automation.
     *
     * @param remediationDescription the remediationDescription value to set.
     * @return the CustomAssessmentAutomationRequestProperties object itself.
     */
    public CustomAssessmentAutomationRequestProperties withRemediationDescription(String remediationDescription) {
        this.remediationDescription = remediationDescription;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}