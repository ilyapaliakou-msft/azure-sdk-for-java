// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.GovernanceAssignmentAdditionalData;
import com.azure.resourcemanager.security.models.GovernanceEmailNotification;
import com.azure.resourcemanager.security.models.RemediationEta;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes properties of an governance assignment. */
@Fluent
public final class GovernanceAssignmentProperties {
    /*
     * The Owner for the governance assignment - e.g. user@contoso.com - see example
     */
    @JsonProperty(value = "owner")
    private String owner;

    /*
     * The remediation due-date - after this date Secure Score will be affected (in case of  active grace-period)
     */
    @JsonProperty(value = "remediationDueDate", required = true)
    private OffsetDateTime remediationDueDate;

    /*
     * The ETA (estimated time of arrival) for remediation (optional), see example
     */
    @JsonProperty(value = "remediationEta")
    private RemediationEta remediationEta;

    /*
     * Defines whether there is a grace period on the governance assignment
     */
    @JsonProperty(value = "isGracePeriod")
    private Boolean isGracePeriod;

    /*
     * The email notifications settings for the governance rule, states whether to disable notifications for mangers
     * and owners
     */
    @JsonProperty(value = "governanceEmailNotification")
    private GovernanceEmailNotification governanceEmailNotification;

    /*
     * The additional data for the governance assignment - e.g. links to ticket (optional), see example
     */
    @JsonProperty(value = "additionalData")
    private GovernanceAssignmentAdditionalData additionalData;

    /**
     * Get the owner property: The Owner for the governance assignment - e.g. user@contoso.com - see example.
     *
     * @return the owner value.
     */
    public String owner() {
        return this.owner;
    }

    /**
     * Set the owner property: The Owner for the governance assignment - e.g. user@contoso.com - see example.
     *
     * @param owner the owner value to set.
     * @return the GovernanceAssignmentProperties object itself.
     */
    public GovernanceAssignmentProperties withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the remediationDueDate property: The remediation due-date - after this date Secure Score will be affected (in
     * case of active grace-period).
     *
     * @return the remediationDueDate value.
     */
    public OffsetDateTime remediationDueDate() {
        return this.remediationDueDate;
    }

    /**
     * Set the remediationDueDate property: The remediation due-date - after this date Secure Score will be affected (in
     * case of active grace-period).
     *
     * @param remediationDueDate the remediationDueDate value to set.
     * @return the GovernanceAssignmentProperties object itself.
     */
    public GovernanceAssignmentProperties withRemediationDueDate(OffsetDateTime remediationDueDate) {
        this.remediationDueDate = remediationDueDate;
        return this;
    }

    /**
     * Get the remediationEta property: The ETA (estimated time of arrival) for remediation (optional), see example.
     *
     * @return the remediationEta value.
     */
    public RemediationEta remediationEta() {
        return this.remediationEta;
    }

    /**
     * Set the remediationEta property: The ETA (estimated time of arrival) for remediation (optional), see example.
     *
     * @param remediationEta the remediationEta value to set.
     * @return the GovernanceAssignmentProperties object itself.
     */
    public GovernanceAssignmentProperties withRemediationEta(RemediationEta remediationEta) {
        this.remediationEta = remediationEta;
        return this;
    }

    /**
     * Get the isGracePeriod property: Defines whether there is a grace period on the governance assignment.
     *
     * @return the isGracePeriod value.
     */
    public Boolean isGracePeriod() {
        return this.isGracePeriod;
    }

    /**
     * Set the isGracePeriod property: Defines whether there is a grace period on the governance assignment.
     *
     * @param isGracePeriod the isGracePeriod value to set.
     * @return the GovernanceAssignmentProperties object itself.
     */
    public GovernanceAssignmentProperties withIsGracePeriod(Boolean isGracePeriod) {
        this.isGracePeriod = isGracePeriod;
        return this;
    }

    /**
     * Get the governanceEmailNotification property: The email notifications settings for the governance rule, states
     * whether to disable notifications for mangers and owners.
     *
     * @return the governanceEmailNotification value.
     */
    public GovernanceEmailNotification governanceEmailNotification() {
        return this.governanceEmailNotification;
    }

    /**
     * Set the governanceEmailNotification property: The email notifications settings for the governance rule, states
     * whether to disable notifications for mangers and owners.
     *
     * @param governanceEmailNotification the governanceEmailNotification value to set.
     * @return the GovernanceAssignmentProperties object itself.
     */
    public GovernanceAssignmentProperties withGovernanceEmailNotification(
        GovernanceEmailNotification governanceEmailNotification) {
        this.governanceEmailNotification = governanceEmailNotification;
        return this;
    }

    /**
     * Get the additionalData property: The additional data for the governance assignment - e.g. links to ticket
     * (optional), see example.
     *
     * @return the additionalData value.
     */
    public GovernanceAssignmentAdditionalData additionalData() {
        return this.additionalData;
    }

    /**
     * Set the additionalData property: The additional data for the governance assignment - e.g. links to ticket
     * (optional), see example.
     *
     * @param additionalData the additionalData value to set.
     * @return the GovernanceAssignmentProperties object itself.
     */
    public GovernanceAssignmentProperties withAdditionalData(GovernanceAssignmentAdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (remediationDueDate() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property remediationDueDate in model GovernanceAssignmentProperties"));
        }
        if (remediationEta() != null) {
            remediationEta().validate();
        }
        if (governanceEmailNotification() != null) {
            governanceEmailNotification().validate();
        }
        if (additionalData() != null) {
            additionalData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GovernanceAssignmentProperties.class);
}