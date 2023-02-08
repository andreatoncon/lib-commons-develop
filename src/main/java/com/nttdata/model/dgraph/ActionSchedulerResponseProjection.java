package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ActionScheduler
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ActionSchedulerResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActionSchedulerResponseProjection() {
    }

    public ActionSchedulerResponseProjection all$() {
        return all$(3);
    }

    public ActionSchedulerResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.type();
        this.date();
        this.cron();
        if (projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ActionExecutionResponseProjection.actions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionSchedulerResponseProjection.ActionExecutionResponseProjection.actions", projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ActionExecutionResponseProjection.actions", 0) + 1);
            this.actions(new ActionExecutionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ActionExecutionResponseProjection.actions", 0)));
        }
        this.status();
        if (projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ResourceResponseProjection.resources", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionSchedulerResponseProjection.ResourceResponseProjection.resources", projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ResourceResponseProjection.resources", 0) + 1);
            this.resources(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ResourceResponseProjection.resources", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ActionTemplateResponseProjection.actionTemplate", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionSchedulerResponseProjection.ActionTemplateResponseProjection.actionTemplate", projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ActionTemplateResponseProjection.actionTemplate", 0) + 1);
            this.actionTemplate(new ActionTemplateResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionSchedulerResponseProjection.ActionTemplateResponseProjection.actionTemplate", 0)));
        }
        this.typename();
        return this;
    }

    public ActionSchedulerResponseProjection id() {
        return id(null);
    }

    public ActionSchedulerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActionSchedulerResponseProjection name() {
        return name(null);
    }

    public ActionSchedulerResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ActionSchedulerResponseProjection description() {
        return description(null);
    }

    public ActionSchedulerResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ActionSchedulerResponseProjection type() {
        return type(null);
    }

    public ActionSchedulerResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ActionSchedulerResponseProjection date() {
        return date(null);
    }

    public ActionSchedulerResponseProjection date(String alias) {
        fields.add(new GraphQLResponseField("date").alias(alias));
        return this;
    }

    public ActionSchedulerResponseProjection cron() {
        return cron(null);
    }

    public ActionSchedulerResponseProjection cron(String alias) {
        fields.add(new GraphQLResponseField("cron").alias(alias));
        return this;
    }

    public ActionSchedulerResponseProjection actions(ActionExecutionResponseProjection subProjection) {
        return actions(null, subProjection);
    }

    public ActionSchedulerResponseProjection actions(String alias, ActionExecutionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actions").alias(alias).projection(subProjection));
        return this;
    }

    public ActionSchedulerResponseProjection status() {
        return status(null);
    }

    public ActionSchedulerResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ActionSchedulerResponseProjection resources(ResourceResponseProjection subProjection) {
        return resources(null, subProjection);
    }

    public ActionSchedulerResponseProjection resources(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resources").alias(alias).projection(subProjection));
        return this;
    }

    public ActionSchedulerResponseProjection actionTemplate(ActionTemplateResponseProjection subProjection) {
        return actionTemplate(null, subProjection);
    }

    public ActionSchedulerResponseProjection actionTemplate(String alias, ActionTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actionTemplate").alias(alias).projection(subProjection));
        return this;
    }

    public ActionSchedulerResponseProjection typename() {
        return typename(null);
    }

    public ActionSchedulerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
