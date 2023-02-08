package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;


import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ResourceProperty
 */
@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-26T09:49:28-0500"
)
public class ResourcePropertyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ResourcePropertyResponseProjection() {
    }

    public ResourcePropertyResponseProjection all$() {
        return all$(3);
    }

    public ResourcePropertyResponseProjection all$(int maxDepth) {
        this.id();
        this.stringValue();
        this.intValue();
        this.booleanValue();
        this.floatValue();
        this.latitudeValue();
        this.longitudeValue();
        this.rangeFromValue();
        this.rangeToValue();
        this.rawValue();
        if (projectionDepthOnFields.getOrDefault("ResourcePropertyResponseProjection.ResourceResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourcePropertyResponseProjection.ResourceResponseProjection.resource", projectionDepthOnFields.getOrDefault("ResourcePropertyResponseProjection.ResourceResponseProjection.resource", 0) + 1);
            this.resource(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourcePropertyResponseProjection.ResourceResponseProjection.resource", 0)));
        }
        this.resourcePropertyType();
        this.typename();
        return this;
    }

    public ResourcePropertyResponseProjection id() {
        return id(null);
    }

    public ResourcePropertyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection stringValue() {
        return stringValue(null);
    }

    public ResourcePropertyResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection intValue() {
        return intValue(null);
    }

    public ResourcePropertyResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public ResourcePropertyResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection floatValue() {
        return floatValue(null);
    }

    public ResourcePropertyResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public ResourcePropertyResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public ResourcePropertyResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public ResourcePropertyResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public ResourcePropertyResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection rawValue() {
        return rawValue(null);
    }

    public ResourcePropertyResponseProjection rawValue(String alias) {
        fields.add(new GraphQLResponseField("rawValue").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection resource(ResourceResponseProjection subProjection) {
        return resource(null, subProjection);
    }

    public ResourcePropertyResponseProjection resource(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resource").alias(alias).projection(subProjection));
        return this;
    }

    public ResourcePropertyResponseProjection resourcePropertyType() {
        return resourcePropertyType(null);
    }

    public ResourcePropertyResponseProjection resourcePropertyType(String alias) {
        fields.add(new GraphQLResponseField("resourcePropertyType").alias(alias));
        return this;
    }

    public ResourcePropertyResponseProjection typename() {
        return typename(null);
    }

    public ResourcePropertyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
