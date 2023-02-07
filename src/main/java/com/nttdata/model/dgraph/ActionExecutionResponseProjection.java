package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ActionExecution
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ActionExecutionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActionExecutionResponseProjection() {
    }

    public ActionExecutionResponseProjection all$() {
        return all$(3);
    }

    public ActionExecutionResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionSchedulerResponseProjection.scheduler", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionExecutionResponseProjection.ActionSchedulerResponseProjection.scheduler", projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionSchedulerResponseProjection.scheduler", 0) + 1);
            this.scheduler(new ActionSchedulerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionSchedulerResponseProjection.scheduler", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionTemplateResponseProjection.template", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionExecutionResponseProjection.ActionTemplateResponseProjection.template", projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionTemplateResponseProjection.template", 0) + 1);
            this.template(new ActionTemplateResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionTemplateResponseProjection.template", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionExecutionItemResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionExecutionResponseProjection.ActionExecutionItemResponseProjection.items", projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionExecutionItemResponseProjection.items", 0) + 1);
            this.items(new ActionExecutionItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionExecutionResponseProjection.ActionExecutionItemResponseProjection.items", 0)));
        }
        this.starTime();
        this.endTime();
        this.typename();
        return this;
    }

    public ActionExecutionResponseProjection id() {
        return id(null);
    }

    public ActionExecutionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActionExecutionResponseProjection scheduler(ActionSchedulerResponseProjection subProjection) {
        return scheduler(null, subProjection);
    }

    public ActionExecutionResponseProjection scheduler(String alias, ActionSchedulerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("scheduler").alias(alias).projection(subProjection));
        return this;
    }

    public ActionExecutionResponseProjection template(ActionTemplateResponseProjection subProjection) {
        return template(null, subProjection);
    }

    public ActionExecutionResponseProjection template(String alias, ActionTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("template").alias(alias).projection(subProjection));
        return this;
    }

    public ActionExecutionResponseProjection items(ActionExecutionItemResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ActionExecutionResponseProjection items(String alias, ActionExecutionItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ActionExecutionResponseProjection starTime() {
        return starTime(null);
    }

    public ActionExecutionResponseProjection starTime(String alias) {
        fields.add(new GraphQLResponseField("starTime").alias(alias));
        return this;
    }

    public ActionExecutionResponseProjection endTime() {
        return endTime(null);
    }

    public ActionExecutionResponseProjection endTime(String alias) {
        fields.add(new GraphQLResponseField("endTime").alias(alias));
        return this;
    }

    public ActionExecutionResponseProjection typename() {
        return typename(null);
    }

    public ActionExecutionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
