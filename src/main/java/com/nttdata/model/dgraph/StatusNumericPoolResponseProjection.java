package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;


import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for StatusNumericPool
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
public class StatusNumericPoolResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public StatusNumericPoolResponseProjection() {
    }

    public StatusNumericPoolResponseProjection all$() {
        return all$(3);
    }

    public StatusNumericPoolResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("StatusNumericPoolResponseProjection.NumericPoolResponseProjection.numericPool", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusNumericPoolResponseProjection.NumericPoolResponseProjection.numericPool", projectionDepthOnFields.getOrDefault("StatusNumericPoolResponseProjection.NumericPoolResponseProjection.numericPool", 0) + 1);
            this.numericPool(new NumericPoolResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusNumericPoolResponseProjection.NumericPoolResponseProjection.numericPool", 0)));
        }
        this.status();
        this.values();
        this.typename();
        return this;
    }

    public StatusNumericPoolResponseProjection id() {
        return id(null);
    }

    public StatusNumericPoolResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public StatusNumericPoolResponseProjection numericPool(NumericPoolResponseProjection subProjection) {
        return numericPool(null, subProjection);
    }

    public StatusNumericPoolResponseProjection numericPool(String alias, NumericPoolResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("numericPool").alias(alias).projection(subProjection));
        return this;
    }

    public StatusNumericPoolResponseProjection status() {
        return status(null);
    }

    public StatusNumericPoolResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public StatusNumericPoolResponseProjection values() {
        return values(null);
    }

    public StatusNumericPoolResponseProjection values(String alias) {
        fields.add(new GraphQLResponseField("values").alias(alias));
        return this;
    }

    public StatusNumericPoolResponseProjection typename() {
        return typename(null);
    }

    public StatusNumericPoolResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
