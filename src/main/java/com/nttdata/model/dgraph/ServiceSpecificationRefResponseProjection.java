package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceSpecificationRef
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class ServiceSpecificationRefResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceSpecificationRefResponseProjection() {
    }

    public ServiceSpecificationRefResponseProjection all$() {
        return all$(3);
    }

    public ServiceSpecificationRefResponseProjection all$(int maxDepth) {
        this.specId();
        this.id();
        this.referredType();
        this.type();
        this.href();
        this.name();
        this.version();
        this.baseType();
        this.schemaLocation();
        if (projectionDepthOnFields.getOrDefault("ServiceSpecificationRefResponseProjection.ServiceSOMResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSpecificationRefResponseProjection.ServiceSOMResponseProjection.services", projectionDepthOnFields.getOrDefault("ServiceSpecificationRefResponseProjection.ServiceSOMResponseProjection.services", 0) + 1);
            this.services(new ServiceSOMResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSpecificationRefResponseProjection.ServiceSOMResponseProjection.services", 0)));
        }

        return this;
    }

    public ServiceSpecificationRefResponseProjection specId() {
        return type(null);
    }

    public ServiceSpecificationRefResponseProjection specId(String alias) {
        fields.add(new GraphQLResponseField("specId").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection baseType() {
        return type(null);
    }

    public ServiceSpecificationRefResponseProjection baseType(String alias) {
        fields.add(new GraphQLResponseField("baseType").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection schemaLocation() {
        return type(null);
    }

    public ServiceSpecificationRefResponseProjection schemaLocation(String alias) {
        fields.add(new GraphQLResponseField("schemaLocation").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection id() {
        return id(null);
    }

    public ServiceSpecificationRefResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection referredType() {
        return referredType(null);
    }

    public ServiceSpecificationRefResponseProjection referredType(String alias) {
        fields.add(new GraphQLResponseField("referredType").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection type() {
        return type(null);
    }

    public ServiceSpecificationRefResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection href() {
        return href(null);
    }

    public ServiceSpecificationRefResponseProjection href(String alias) {
        fields.add(new GraphQLResponseField("href").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection name() {
        return name(null);
    }

    public ServiceSpecificationRefResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection version() {
        return version(null);
    }

    public ServiceSpecificationRefResponseProjection version(String alias) {
        fields.add(new GraphQLResponseField("version").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection services(ServiceSOMResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public ServiceSpecificationRefResponseProjection services(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSpecificationRefResponseProjection _id() {
        return _id(null);
    }

    public ServiceSpecificationRefResponseProjection _id(String alias) {
        fields.add(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public ServiceSpecificationRefResponseProjection typename() {
        return typename(null);
    }

    public ServiceSpecificationRefResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
