// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackPlannedFailoverProviderInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackRecoveryPointType;
import org.junit.jupiter.api.Assertions;

public final class InMageRcmFailbackPlannedFailoverProviderInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmFailbackPlannedFailoverProviderInput model =
            BinaryData
                .fromString("{\"instanceType\":\"InMageRcmFailback\",\"recoveryPointType\":\"CrashConsistent\"}")
                .toObject(InMageRcmFailbackPlannedFailoverProviderInput.class);
        Assertions.assertEquals(InMageRcmFailbackRecoveryPointType.CRASH_CONSISTENT, model.recoveryPointType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmFailbackPlannedFailoverProviderInput model =
            new InMageRcmFailbackPlannedFailoverProviderInput()
                .withRecoveryPointType(InMageRcmFailbackRecoveryPointType.CRASH_CONSISTENT);
        model = BinaryData.fromObject(model).toObject(InMageRcmFailbackPlannedFailoverProviderInput.class);
        Assertions.assertEquals(InMageRcmFailbackRecoveryPointType.CRASH_CONSISTENT, model.recoveryPointType());
    }
}
