package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ResourceReference
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-24T11:24:37-0500"
)
public class ResourceReferenceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ResourceReferenceResponseProjection() {
    }

    public ResourceReferenceResponseProjection all$() {
        return all$(3);
    }

    public ResourceReferenceResponseProjection all$(int maxDepth) {
        this.id();
        this.externalId();
        this.href();
        this.type();
        this.typename();
        return this;
    }

    public ResourceReferenceResponseProjection id() {
        return id(null);
    }

    public ResourceReferenceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ResourceReferenceResponseProjection externalId() {
        return externalId(null);
    }

    public ResourceReferenceResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ResourceReferenceResponseProjection href() {
        return href(null);
    }

    public ResourceReferenceResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public ResourceReferenceResponseProjection type() {
        return type(null);
    }

    public ResourceReferenceResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ResourceReferenceResponseProjection typename() {
        return typename(null);
    }

    public ResourceReferenceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
