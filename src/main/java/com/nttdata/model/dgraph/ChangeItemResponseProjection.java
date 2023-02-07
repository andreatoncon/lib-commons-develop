package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import com.nttdata.model.dgraph.ResourceResponseProjection;


import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ChangeItem
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
public class ChangeItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChangeItemResponseProjection() {
    }

    public ChangeItemResponseProjection all$() {
        return all$(3);
    }

    public ChangeItemResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ChangeItemResponseProjection.ResourceResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChangeItemResponseProjection.ResourceResponseProjection.resource", projectionDepthOnFields.getOrDefault("ChangeItemResponseProjection.ResourceResponseProjection.resource", 0) + 1);
            this.resource(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChangeItemResponseProjection.ResourceResponseProjection.resource", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ChangeItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChangeItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", projectionDepthOnFields.getOrDefault("ChangeItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", 0) + 1);
            this.parameterType(new ConfigurationParameterTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChangeItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", 0)));
        }
        this.stringValue();
        this.intValue();
        this.booleanValue();
        this.floatValue();
        this.latitudeValue();
        this.longitudeValue();
        this.rangeFromValue();
        this.rangeToValue();
        this.status();
        this.typename();
        return this;
    }

    public ChangeItemResponseProjection id() {
        return id(null);
    }

    public ChangeItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection resource(ResourceResponseProjection subProjection) {
        return resource(null, subProjection);
    }

    public ChangeItemResponseProjection resource(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resource").alias(alias).projection(subProjection));
        return this;
    }

    public ChangeItemResponseProjection parameterType(ConfigurationParameterTypeResponseProjection subProjection) {
        return parameterType(null, subProjection);
    }

    public ChangeItemResponseProjection parameterType(String alias, ConfigurationParameterTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parameterType").alias(alias).projection(subProjection));
        return this;
    }

    public ChangeItemResponseProjection stringValue() {
        return stringValue(null);
    }

    public ChangeItemResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection intValue() {
        return intValue(null);
    }

    public ChangeItemResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public ChangeItemResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection floatValue() {
        return floatValue(null);
    }

    public ChangeItemResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public ChangeItemResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public ChangeItemResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public ChangeItemResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public ChangeItemResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection status() {
        return status(null);
    }

    public ChangeItemResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ChangeItemResponseProjection typename() {
        return typename(null);
    }

    public ChangeItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
