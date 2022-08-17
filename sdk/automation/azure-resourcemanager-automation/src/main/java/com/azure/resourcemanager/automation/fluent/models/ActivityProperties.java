// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.ActivityOutputType;
import com.azure.resourcemanager.automation.models.ActivityParameterSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of the activity. */
@Fluent
public final class ActivityProperties {
    /*
     * Gets or sets the user name of the activity.
     */
    @JsonProperty(value = "definition")
    private String definition;

    /*
     * Gets or sets the parameter sets of the activity.
     */
    @JsonProperty(value = "parameterSets")
    private List<ActivityParameterSet> parameterSets;

    /*
     * Gets or sets the output types of the activity.
     */
    @JsonProperty(value = "outputTypes")
    private List<ActivityOutputType> outputTypes;

    /*
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the definition property: Gets or sets the user name of the activity.
     *
     * @return the definition value.
     */
    public String definition() {
        return this.definition;
    }

    /**
     * Set the definition property: Gets or sets the user name of the activity.
     *
     * @param definition the definition value to set.
     * @return the ActivityProperties object itself.
     */
    public ActivityProperties withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get the parameterSets property: Gets or sets the parameter sets of the activity.
     *
     * @return the parameterSets value.
     */
    public List<ActivityParameterSet> parameterSets() {
        return this.parameterSets;
    }

    /**
     * Set the parameterSets property: Gets or sets the parameter sets of the activity.
     *
     * @param parameterSets the parameterSets value to set.
     * @return the ActivityProperties object itself.
     */
    public ActivityProperties withParameterSets(List<ActivityParameterSet> parameterSets) {
        this.parameterSets = parameterSets;
        return this;
    }

    /**
     * Get the outputTypes property: Gets or sets the output types of the activity.
     *
     * @return the outputTypes value.
     */
    public List<ActivityOutputType> outputTypes() {
        return this.outputTypes;
    }

    /**
     * Set the outputTypes property: Gets or sets the output types of the activity.
     *
     * @param outputTypes the outputTypes value to set.
     * @return the ActivityProperties object itself.
     */
    public ActivityProperties withOutputTypes(List<ActivityOutputType> outputTypes) {
        this.outputTypes = outputTypes;
        return this;
    }

    /**
     * Get the creationTime property: Gets or sets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the ActivityProperties object itself.
     */
    public ActivityProperties withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the ActivityProperties object itself.
     */
    public ActivityProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the ActivityProperties object itself.
     */
    public ActivityProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameterSets() != null) {
            parameterSets().forEach(e -> e.validate());
        }
        if (outputTypes() != null) {
            outputTypes().forEach(e -> e.validate());
        }
    }
}