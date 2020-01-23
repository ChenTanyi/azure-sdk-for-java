/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Store inner error information.
 */
public class InnerError {
    /**
     * the stack trace for the error.
     */
    @JsonProperty(value = "trace", access = JsonProperty.Access.WRITE_ONLY)
    private String trace;

    /**
     * the context for the error message.
     */
    @JsonProperty(value = "context", access = JsonProperty.Access.WRITE_ONLY)
    private String context;

    /**
     * Get the stack trace for the error.
     *
     * @return the trace value
     */
    public String trace() {
        return this.trace;
    }

    /**
     * Get the context for the error message.
     *
     * @return the context value
     */
    public String context() {
        return this.context;
    }

}