// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

import com.azure.core.util.Context;

/** Samples for AdminKeys Get. */
public final class AdminKeysGetSamples {
    /*
     * x-ms-original-file: specification/search/resource-manager/Microsoft.Search/stable/2020-08-01/examples/SearchGetAdminKeys.json
     */
    /**
     * Sample code: SearchGetAdminKeys.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void searchGetAdminKeys(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .searchServices()
            .manager()
            .serviceClient()
            .getAdminKeys()
            .getWithResponse("rg1", "mysearchservice", null, Context.NONE);
    }
}