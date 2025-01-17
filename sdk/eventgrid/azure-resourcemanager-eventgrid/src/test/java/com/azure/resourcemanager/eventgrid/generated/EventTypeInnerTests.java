// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.EventTypeInner;
import org.junit.jupiter.api.Assertions;

public final class EventTypeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventTypeInner model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":\"qpkzfbojxjmcsmy\",\"description\":\"ixvcpwnkwywzwo\",\"schemaUrl\":\"lickduoi\",\"isInDefaultSet\":false},\"id\":\"mt\",\"name\":\"vsknxrwzawnv\",\"type\":\"bcfhzagxnv\"}")
            .toObject(EventTypeInner.class);
        Assertions.assertEquals("qpkzfbojxjmcsmy", model.displayName());
        Assertions.assertEquals("ixvcpwnkwywzwo", model.description());
        Assertions.assertEquals("lickduoi", model.schemaUrl());
        Assertions.assertEquals(false, model.isInDefaultSet());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventTypeInner model = new EventTypeInner().withDisplayName("qpkzfbojxjmcsmy").withDescription("ixvcpwnkwywzwo")
            .withSchemaUrl("lickduoi").withIsInDefaultSet(false);
        model = BinaryData.fromObject(model).toObject(EventTypeInner.class);
        Assertions.assertEquals("qpkzfbojxjmcsmy", model.displayName());
        Assertions.assertEquals("ixvcpwnkwywzwo", model.description());
        Assertions.assertEquals("lickduoi", model.schemaUrl());
        Assertions.assertEquals(false, model.isInDefaultSet());
    }
}
