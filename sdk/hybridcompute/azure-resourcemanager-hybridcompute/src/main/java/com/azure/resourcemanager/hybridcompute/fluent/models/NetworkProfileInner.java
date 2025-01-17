// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.models.NetworkInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the network information on this machine. */
@Fluent
public final class NetworkProfileInner {
    /*
     * The list of network interfaces.
     */
    @JsonProperty(value = "networkInterfaces")
    private List<NetworkInterface> networkInterfaces;

    /** Creates an instance of NetworkProfileInner class. */
    public NetworkProfileInner() {
    }

    /**
     * Get the networkInterfaces property: The list of network interfaces.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces property: The list of network interfaces.
     *
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
    }
}
