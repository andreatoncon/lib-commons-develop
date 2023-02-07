package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CMVersion
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class CMVersionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CMVersionResponseProjection() {
    }

    public CMVersionResponseProjection all$() {
        return all$(3);
    }

    public CMVersionResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.ParameterResponseProjection.parameters", 0) <= maxDepth) {
            projectionDepthOnFields.put("CMVersionResponseProjection.ParameterResponseProjection.parameters", projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.ParameterResponseProjection.parameters", 0) + 1);
            this.parameters(new ParameterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.ParameterResponseProjection.parameters", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.CMVersionResponseProjection.previous", 0) <= maxDepth) {
            projectionDepthOnFields.put("CMVersionResponseProjection.CMVersionResponseProjection.previous", projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.CMVersionResponseProjection.previous", 0) + 1);
            this.previous(new CMVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.CMVersionResponseProjection.previous", 0)));
        }
        this.validFrom();
        this.validTo();
        this.status();
        if (projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.ResourceResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields.put("CMVersionResponseProjection.ResourceResponseProjection.resource", projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.ResourceResponseProjection.resource", 0) + 1);
            this.resource(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CMVersionResponseProjection.ResourceResponseProjection.resource", 0)));
        }
        this.typename();
        return this;
    }

    public CMVersionResponseProjection id() {
        return id(null);
    }

    public CMVersionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CMVersionResponseProjection parameters(ParameterResponseProjection subProjection) {
        return parameters(null, subProjection);
    }

    public CMVersionResponseProjection parameters(String alias, ParameterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parameters").alias(alias).projection(subProjection));
        return this;
    }

    public CMVersionResponseProjection previous(CMVersionResponseProjection subProjection) {
        return previous(null, subProjection);
    }

    public CMVersionResponseProjection previous(String alias, CMVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("previous").alias(alias).projection(subProjection));
        return this;
    }

    public CMVersionResponseProjection validFrom() {
        return validFrom(null);
    }

    public CMVersionResponseProjection validFrom(String alias) {
        fields.add(new GraphQLResponseField("validFrom").alias(alias));
        return this;
    }

    public CMVersionResponseProjection validTo() {
        return validTo(null);
    }

    public CMVersionResponseProjection validTo(String alias) {
        fields.add(new GraphQLResponseField("validTo").alias(alias));
        return this;
    }

    public CMVersionResponseProjection status() {
        return status(null);
    }

    public CMVersionResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public CMVersionResponseProjection resource(ResourceResponseProjection subProjection) {
        return resource(null, subProjection);
    }

    public CMVersionResponseProjection resource(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resource").alias(alias).projection(subProjection));
        return this;
    }

    public CMVersionResponseProjection typename() {
        return typename(null);
    }

    public CMVersionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
