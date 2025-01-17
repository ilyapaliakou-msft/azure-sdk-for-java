// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** the type of action that should occur when the scale rule fires. */
public enum ScaleType {
    /** Enum value ChangeCount. */
    CHANGE_COUNT("ChangeCount"),

    /** Enum value PercentChangeCount. */
    PERCENT_CHANGE_COUNT("PercentChangeCount"),

    /** Enum value ExactCount. */
    EXACT_COUNT("ExactCount"),

    /** Enum value ServiceAllowedNextValue. */
    SERVICE_ALLOWED_NEXT_VALUE("ServiceAllowedNextValue");

    /** The actual serialized value for a ScaleType instance. */
    private final String value;

    ScaleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ScaleType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ScaleType object, or null if unable to parse.
     */
    @JsonCreator
    public static ScaleType fromString(String value) {
        if (value == null) {
            return null;
        }
        ScaleType[] items = ScaleType.values();
        for (ScaleType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
