package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ActionTemplate
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-06-17T16:58:08-0500"
)
public class ActionTemplateResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActionTemplateResponseProjection() {
    }

    public ActionTemplateResponseProjection all$() {
        return all$(3);
    }

    public ActionTemplateResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.type();
        this.resourceSpecifications();
        if (projectionDepthOnFields.getOrDefault("ActionTemplateResponseProjection.ActionTemplateItemResponseProjection.actionTemplateItem", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionTemplateResponseProjection.ActionTemplateItemResponseProjection.actionTemplateItem", projectionDepthOnFields.getOrDefault("ActionTemplateResponseProjection.ActionTemplateItemResponseProjection.actionTemplateItem", 0) + 1);
            this.actionTemplateItems(new ActionTemplateItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionTemplateResponseProjection.ActionTemplateItemResponseProjection.actionTemplateItem", 0)));
        }
        this.typename();
        return this;
    }

    public ActionTemplateResponseProjection id() {
        return id(null);
    }

    public ActionTemplateResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActionTemplateResponseProjection name() {
        return name(null);
    }

    public ActionTemplateResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ActionTemplateResponseProjection type() {
        return type(null);
    }

    public ActionTemplateResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ActionTemplateResponseProjection resourceSpecifications() {
        return resourceSpecifications(null);
    }

    public ActionTemplateResponseProjection resourceSpecifications(String alias) {
        fields.add(new GraphQLResponseField("resourceSpecifications").alias(alias));
        return this;
    }

    public ActionTemplateResponseProjection actionTemplateItems(ActionTemplateItemResponseProjection subProjection) {
        return actionTemplateItems(null, subProjection);
    }

    public ActionTemplateResponseProjection actionTemplateItems(String alias, ActionTemplateItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actionTemplateItems").alias(alias).projection(subProjection));
        return this;
    }

    public ActionTemplateResponseProjection actionExecutions(ActionExecutionResponseProjection subProjection) {
        return actionExecutions(null, subProjection);
    }

    public ActionTemplateResponseProjection actionExecutions(String alias, ActionExecutionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actionExecutions").alias(alias).projection(subProjection));
        return this;
    }

    public ActionTemplateResponseProjection typename() {
        return typename(null);
    }

    public ActionTemplateResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
