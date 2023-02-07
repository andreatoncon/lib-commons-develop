package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import com.nttdata.model.tmf.ActionExecution;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ActionTemplateItem
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ActionTemplateItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActionTemplateItemResponseProjection() {
    }

    public ActionTemplateItemResponseProjection all$() {
        return all$(3);
    }

    public ActionTemplateItemResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionTemplateItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", 0) + 1);
            this.parameters(new ConfigurationParameterTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ConfigurationParameterTypeResponseProjection.parameters", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ParameterResponseProjection.value", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionTemplateItemResponseProjection.ParameterResponseProjection.value", projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ParameterResponseProjection.value", 0) + 1);
            this.value(new ParameterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ParameterResponseProjection.value", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ActionTemplateResponseProjection.actionTemplate", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionTemplateItemResponseProjection.ActionTemplateResponseProjection.actionTemplate", projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ActionTemplateResponseProjection.actionTemplate", 0) + 1);
            this.actionTemplate(new ActionTemplateResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionTemplateItemResponseProjection.ActionTemplateResponseProjection.actionTemplate", 0)));
        }
        this.typename();
        return this;
    }

    public ActionTemplateItemResponseProjection id() {
        return id(null);
    }

    public ActionTemplateItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActionTemplateItemResponseProjection parameters(ConfigurationParameterTypeResponseProjection subProjection) {
        return parameters(null, subProjection);
    }

    public ActionTemplateItemResponseProjection parameters(String alias, ConfigurationParameterTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parameters").alias(alias).projection(subProjection));
        return this;
    }

    public ActionTemplateItemResponseProjection value(ParameterResponseProjection subProjection) {
        return value(null, subProjection);
    }

    public ActionTemplateItemResponseProjection value(String alias, ParameterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("value").alias(alias).projection(subProjection));
        return this;
    }

    public ActionTemplateItemResponseProjection actionTemplate(ActionTemplateResponseProjection subProjection) {
        return actionTemplate(null, subProjection);
    }

    public ActionTemplateItemResponseProjection actionTemplate(String alias, ActionTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actionTemplate").alias(alias).projection(subProjection));
        return this;
    }

    public ActionTemplateItemResponseProjection typename() {
        return typename(null);
    }

    public ActionTemplateItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
