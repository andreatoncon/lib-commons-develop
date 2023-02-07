package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ResourceType
 */
@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-26T09:49:28-0500"
)
public class ResourceTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ResourceTypeResponseProjection() {
    }

    public ResourceTypeResponseProjection all$() {
        return all$(3);
    }

    public ResourceTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.resourceTypeBaseType();
        this.resourceTypeClass();
        this.typename();
        return this;
    }

    public ResourceTypeResponseProjection id() {
        return id(null);
    }

    public ResourceTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ResourceTypeResponseProjection name() {
        return name(null);
    }

    public ResourceTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ResourceTypeResponseProjection resourceTypeBaseType() {
        return resourceTypeBaseType(null);
    }

    public ResourceTypeResponseProjection resourceTypeBaseType(String alias) {
        fields.add(new GraphQLResponseField("resourceTypeBaseType").alias(alias));
        return this;
    }

    public ResourceTypeResponseProjection resourceTypeClass() {
        return resourceTypeClass(null);
    }

    public ResourceTypeResponseProjection resourceTypeClass(String alias) {
        fields.add(new GraphQLResponseField("resourceTypeClass").alias(alias));
        return this;
    }

    public ResourceTypeResponseProjection typename() {
        return typename(null);
    }

    public ResourceTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
