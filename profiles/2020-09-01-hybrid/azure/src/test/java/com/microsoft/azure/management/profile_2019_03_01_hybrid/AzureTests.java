/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.profile_2019_03_01_hybrid;

import com.microsoft.azure.arm.core.TestBase;
import com.microsoft.azure.arm.resources.Region;
import com.microsoft.azure.arm.utils.SdkContext;
import com.microsoft.azure.management.resources.v2016_06_01.Subscription;
import com.microsoft.azure.management.resources.v2019_10_01.ResourceGroup;
import com.microsoft.azure.management.storage.v2019_06_01.Kind;
import com.microsoft.azure.management.storage.v2019_06_01.SkuName;
import com.microsoft.azure.management.storage.v2019_06_01.StorageAccount;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.SkuInner;
import com.microsoft.rest.RestClient;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AzureTests extends TestBase {
    protected static Azure.Authenticated authenticated;
    private static String rgName;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        authenticated = Azure.authenticate(restClient);
    }

    @Override
    protected void cleanUpResources() {
    }

    @Test
    public void firstTest() throws Exception {
        List<Subscription> subscriptions = authenticated.subscriptionsManager().subscriptions().list();

        if (subscriptions == null || subscriptions.size() == 0) {
            Assert.fail("Credential isn't assigned to any subscription");
        }

        Azure azure = authenticated.withSubscription(subscriptions.get(0).subscriptionId());

        rgName = SdkContext.randomResourceName("rg", 20);
        String saName = SdkContext.randomResourceName("sa", 20);
        ResourceGroup group = azure.resourceManager().resourceGroups()
                .define(rgName)
                .withExistingSubscription()
                .withLocation(Region.US_WEST.toString())
                .create();
        Assert.assertNotNull(group);

        StorageAccount storageAccount = azure.storageManager().storageAccounts()
                .define(saName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withKind(Kind.STORAGE)
                .withSku(new SkuInner().withName(SkuName.STANDARD_LRS))
                .create();

        Assert.assertNotNull(storageAccount);
        Assert.assertNotNull(storageAccount.id());
    }
}
