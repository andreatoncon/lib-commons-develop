package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ActionExecutionItem
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ActionExecutionItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActionExecutionItemResponseProjection() {
    }

    public ActionExecutionItemResponseProjection all$() {
        return all$(3);
    }

    public ActionExecutionItemResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ActionExecutionItemResponseProjection.ActionExecutionResponseProjection.action", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionExecutionItemResponseProjection.ActionExecutionResponseProjection.action", projectionDepthOnFields.getOrDefault("ActionExecutionItemResponseProjection.ActionExecutionResponseProjection.action", 0) + 1);
            this.action(new ActionExecutionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionExecutionItemResponseProjection.ActionExecutionResponseProjection.action", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionExecutionItemResponseProjection.ResourceResponseProjection.resources", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionExecutionItemResponseProjection.ResourceResponseProjection.resources", projectionDepthOnFields.getOrDefault("ActionExecutionItemResponseProjection.ResourceResponseProjection.resources", 0) + 1);
            this.resources(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionExecutionItemResponseProjection.ResourceResponseProjection.resources", 0)));
        }
        this.status();
        this.typename();
        return this;
    }

    public ActionExecutionItemResponseProjection id() {
        return id(null);
    }

    public ActionExecutionItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActionExecutionItemResponseProjection action(ActionExecutionResponseProjection subProjection) {
        return action(null, subProjection);
    }

    public ActionExecutionItemResponseProjection action(String alias, ActionExecutionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("action").alias(alias).projection(subProjection));
        return this;
    }

    public ActionExecutionItemResponseProjection resources(ResourceResponseProjection subProjection) {
        return resources(null, subProjection);
    }

    public ActionExecutionItemResponseProjection resources(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resources").alias(alias).projection(subProjection));
        return this;
    }

    public ActionExecutionItemResponseProjection status() {
        return status(null);
    }

    public ActionExecutionItemResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ActionExecutionItemResponseProjection typename() {
        return typename(null);
    }

    public ActionExecutionItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
