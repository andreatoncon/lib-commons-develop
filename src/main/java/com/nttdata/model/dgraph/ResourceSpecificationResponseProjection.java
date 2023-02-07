package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ResourceSpecification
 */
@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-26T09:49:28-0500"
)
public class ResourceSpecificationResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ResourceSpecificationResponseProjection() {
    }

    public ResourceSpecificationResponseProjection all$() {
        return all$(3);
    }

    public ResourceSpecificationResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.quantity();
        if (projectionDepthOnFields.getOrDefault("ResourceSpecificationResponseProjection.ResourceTypeResponseProjection.resourceType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceSpecificationResponseProjection.ResourceTypeResponseProjection.resourceType", projectionDepthOnFields.getOrDefault("ResourceSpecificationResponseProjection.ResourceTypeResponseProjection.resourceType", 0) + 1);
            this.resourceType(new ResourceTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceSpecificationResponseProjection.ResourceTypeResponseProjection.resourceType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ResourceSpecificationResponseProjection.ResourcePropertyTypeResponseProjection.resourcePropertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceSpecificationResponseProjection.ResourcePropertyTypeResponseProjection.resourcePropertyTypes", projectionDepthOnFields.getOrDefault("ResourceSpecificationResponseProjection.ResourcePropertyTypeResponseProjection.resourcePropertyTypes", 0) + 1);
            this.resourcePropertyTypes(new ResourcePropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceSpecificationResponseProjection.ResourcePropertyTypeResponseProjection.resourcePropertyTypes", 0)));
        }
        this.typename();
        return this;
    }

    public ResourceSpecificationResponseProjection id() {
        return id(null);
    }

    public ResourceSpecificationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ResourceSpecificationResponseProjection name() {
        return name(null);
    }

    public ResourceSpecificationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ResourceSpecificationResponseProjection quantity() {
        return quantity(null);
    }

    public ResourceSpecificationResponseProjection quantity(String alias) {
        fields.add(new GraphQLResponseField("quantity").alias(alias));
        return this;
    }

    public ResourceSpecificationResponseProjection resourceType(ResourceTypeResponseProjection subProjection) {
        return resourceType(null, subProjection);
    }

    public ResourceSpecificationResponseProjection resourceType(String alias, ResourceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resourceType").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceSpecificationResponseProjection resourcePropertyTypes(ResourcePropertyTypeResponseProjection subProjection) {
        return resourcePropertyTypes(null, subProjection);
    }

    public ResourceSpecificationResponseProjection resourcePropertyTypes(String alias, ResourcePropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resourcePropertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceSpecificationResponseProjection typename() {
        return typename(null);
    }

    public ResourceSpecificationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
