// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An object describing the location and semantic content of a document. */
@Immutable
public final class Document {
    /*
     * Document type.
     */
    @JsonProperty(value = "docType", required = true)
    private String docType;

    /*
     * Bounding regions covering the document.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the document in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /*
     * Dictionary of named field values.
     */
    @JsonProperty(value = "fields")
    private Map<String, DocumentField> fields;

    /*
     * Confidence of correctly extracting the document.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /**
     * Creates an instance of Document class.
     *
     * @param docType the docType value to set.
     * @param spans the spans value to set.
     * @param confidence the confidence value to set.
     */
    @JsonCreator
    private Document(
            @JsonProperty(value = "docType", required = true) String docType,
            @JsonProperty(value = "spans", required = true) List<DocumentSpan> spans,
            @JsonProperty(value = "confidence", required = true) float confidence) {
        this.docType = docType;
        this.spans = spans;
        this.confidence = confidence;
    }

    /**
     * Get the docType property: Document type.
     *
     * @return the docType value.
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the document.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the document in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the fields property: Dictionary of named field values.
     *
     * @return the fields value.
     */
    public Map<String, DocumentField> getFields() {
        return this.fields;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the document.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }
}
