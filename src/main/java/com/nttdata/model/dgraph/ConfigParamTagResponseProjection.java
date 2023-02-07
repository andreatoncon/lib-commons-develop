package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ConfigParamTag
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ConfigParamTagResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ConfigParamTagResponseProjection() {
    }

    public ConfigParamTagResponseProjection all$() {
        return all$(3);
    }

    public ConfigParamTagResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ConfigParamTagResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConfigParamTagResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", projectionDepthOnFields.getOrDefault("ConfigParamTagResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", 0) + 1);
            this.parameters(new ConfigurationParameterTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConfigParamTagResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", 0)));
        }
        this.typename();
        return this;
    }

    public ConfigParamTagResponseProjection id() {
        return id(null);
    }

    public ConfigParamTagResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ConfigParamTagResponseProjection name() {
        return name(null);
    }

    public ConfigParamTagResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ConfigParamTagResponseProjection parameters(ConfigurationParameterTypeResponseProjection subProjection) {
        return parameters(null, subProjection);
    }

    public ConfigParamTagResponseProjection parameters(String alias, ConfigurationParameterTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parameters").alias(alias).projection(subProjection));
        return this;
    }

    public ConfigParamTagResponseProjection typename() {
        return typename(null);
    }

    public ConfigParamTagResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
