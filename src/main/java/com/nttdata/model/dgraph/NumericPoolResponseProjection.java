package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;


import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for NumericPool
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
public class NumericPoolResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NumericPoolResponseProjection() {
    }

    public NumericPoolResponseProjection all$() {
        return all$(3);
    }

    public NumericPoolResponseProjection all$(int maxDepth) {
        this.id();
        this.description();
        this.limit();
        this.customLimit();
        if (projectionDepthOnFields.getOrDefault("NumericPoolResponseProjection.ResourceResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields.put("NumericPoolResponseProjection.ResourceResponseProjection.resource", projectionDepthOnFields.getOrDefault("NumericPoolResponseProjection.ResourceResponseProjection.resource", 0) + 1);
            this.resources(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NumericPoolResponseProjection.ResourceResponseProjection.resource", 0)));
        }
        this.isDeleted();
        if (projectionDepthOnFields.getOrDefault("NumericPoolResponseProjection.StatusNumericPoolResponseProjection.statusNumericPools", 0) <= maxDepth) {
            projectionDepthOnFields.put("NumericPoolResponseProjection.StatusNumericPoolResponseProjection.statusNumericPools", projectionDepthOnFields.getOrDefault("NumericPoolResponseProjection.StatusNumericPoolResponseProjection.statusNumericPools", 0) + 1);
            this.statusNumericPools(new StatusNumericPoolResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NumericPoolResponseProjection.StatusNumericPoolResponseProjection.statusNumericPools", 0)));
        }
        this.typename();
        return this;
    }

    public NumericPoolResponseProjection id() {
        return id(null);
    }

    public NumericPoolResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NumericPoolResponseProjection description() {
        return description(null);
    }

    public NumericPoolResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public NumericPoolResponseProjection limit() {
        return limit(null);
    }

    public NumericPoolResponseProjection limit(String alias) {
        fields.add(new GraphQLResponseField("limit").alias(alias));
        return this;
    }

    public NumericPoolResponseProjection customLimit() {
        return customLimit(null);
    }

    public NumericPoolResponseProjection customLimit(String alias) {
        fields.add(new GraphQLResponseField("customLimit").alias(alias));
        return this;
    }

    public NumericPoolResponseProjection resources(ResourceResponseProjection subProjection) {
        return resources(null, subProjection);
    }

    public NumericPoolResponseProjection resources(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resources").alias(alias).projection(subProjection));
        return this;
    }

    public NumericPoolResponseProjection isDeleted() {
        return isDeleted(null);
    }

    public NumericPoolResponseProjection isDeleted(String alias) {
        fields.add(new GraphQLResponseField("isDeleted").alias(alias));
        return this;
    }

    public NumericPoolResponseProjection statusNumericPools(StatusNumericPoolResponseProjection subProjection) {
        return statusNumericPools(null, subProjection);
    }

    public NumericPoolResponseProjection statusNumericPools(String alias, StatusNumericPoolResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("statusNumericPools").alias(alias).projection(subProjection));
        return this;
    }

    public NumericPoolResponseProjection typename() {
        return typename(null);
    }

    public NumericPoolResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
