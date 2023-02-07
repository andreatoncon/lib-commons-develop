package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

public class ServiceReferenceResponseProjection extends GraphQLResponseProjection {
    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceReferenceResponseProjection() {
    }

    public ServiceReferenceResponseProjection all$() {
        return all$(3);
    }

    public ServiceReferenceResponseProjection all$(int maxDepth) {
        this.id();
        this.href();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ServiceReferenceResponseProjection.SupportingResourceResponseProjection.supportingResource", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceReferenceResponseProjection.SupportingResourceResponseProjection.supportingResource", projectionDepthOnFields.getOrDefault("ServiceReferenceResponseProjection.SupportingResourceResponseProjection.supportingResource", 0) + 1);
            this.supportingResource(new SupportingResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceReferenceResponseProjection.SupportingResourceResponseProjection.supportingResource", 0)));
        }
        this.specificationName();
        this.externalId();
        this.specificationId();
        this.typename();
        return this;
    }

    public ServiceReferenceResponseProjection id() {
        return id(null);
    }

    public ServiceReferenceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceReferenceResponseProjection href() {
        return href(null);
    }

    public ServiceReferenceResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public ServiceReferenceResponseProjection name() {
        return name(null);
    }

    public ServiceReferenceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceReferenceResponseProjection supportingResource(SupportingResourceResponseProjection subProjection) {
        return supportingResource(null, subProjection);
    }

    public ServiceReferenceResponseProjection supportingResource(String alias, SupportingResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("supportingResource").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceReferenceResponseProjection specificationName() {
        return specificationName(null);
    }

    public ServiceReferenceResponseProjection specificationName(String alias) {
        fields.add(new GraphQLResponseField("specificationName").alias(alias));
        return this;
    }

    public ServiceReferenceResponseProjection externalId() {
        return externalId(null);
    }

    public ServiceReferenceResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ServiceReferenceResponseProjection specificationId() {
        return specificationId(null);
    }

    public ServiceReferenceResponseProjection specificationId(String alias) {
        fields.add(new GraphQLResponseField("specificationId").alias(alias));
        return this;
    }

    public ServiceReferenceResponseProjection typename() {
        return typename(null);
    }

    public ServiceReferenceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }
}
