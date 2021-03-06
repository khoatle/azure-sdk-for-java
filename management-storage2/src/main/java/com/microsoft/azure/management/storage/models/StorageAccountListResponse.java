/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.storage.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;

/**
* The list storage accounts operation response.
*/
public class StorageAccountListResponse extends OperationResponse {
    private String nextLink;
    
    /**
    * Optional. Gets the link to the next set of results. Currently this will
    * always be empty as the API does not support pagination.
    * @return The NextLink value.
    */
    public String getNextLink() {
        return this.nextLink;
    }
    
    /**
    * Optional. Gets the link to the next set of results. Currently this will
    * always be empty as the API does not support pagination.
    * @param nextLinkValue The NextLink value.
    */
    public void setNextLink(final String nextLinkValue) {
        this.nextLink = nextLinkValue;
    }
    
    private ArrayList<StorageAccount> storageAccounts;
    
    /**
    * Optional. Gets the list of storage accounts and their properties.
    * @return The StorageAccounts value.
    */
    public ArrayList<StorageAccount> getStorageAccounts() {
        return this.storageAccounts;
    }
    
    /**
    * Optional. Gets the list of storage accounts and their properties.
    * @param storageAccountsValue The StorageAccounts value.
    */
    public void setStorageAccounts(final ArrayList<StorageAccount> storageAccountsValue) {
        this.storageAccounts = storageAccountsValue;
    }
    
    /**
    * Initializes a new instance of the StorageAccountListResponse class.
    *
    */
    public StorageAccountListResponse() {
        super();
        this.setStorageAccounts(new LazyArrayList<StorageAccount>());
    }
}
