package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Resource
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ResourceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ResourceResponseProjection() {
    }

    public ResourceResponseProjection all$() {
        return all$(3);
    }

    public ResourceResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.available();
        this.externalId();
        this.lifecycleStatus();
        this.planningSubStatus();
        this.administrativeSubStatus();
        this.operationalSubStatus();
        this.usageSubStatus();
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.belongsTo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.belongsTo", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.belongsTo", 0) + 1);
            this.belongsTo(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.belongsTo", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.composedOf", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.composedOf", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.composedOf", 0) + 1);
            this.composedOf(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.composedOf", 0)));
        }
        this.locatedIn();
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.physicalLink", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.physicalLink", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.physicalLink", 0) + 1);
            this.physicalLink(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.physicalLink", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.physicalLinkInv", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.physicalLinkInv", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.physicalLinkInv", 0) + 1);
            this.physicalLinkInv(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.physicalLinkInv", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.logicalLink", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.logicalLink", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.logicalLink", 0) + 1);
            this.logicalLinks(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.logicalLink", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.logicalLinkInv", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.logicalLinkInv", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.logicalLinkInv", 0) + 1);
            this.logicalLinkInv(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.logicalLinkInv", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.crossConnection", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.crossConnection", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.crossConnection", 0) + 1);
            this.crossConnection(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.crossConnection", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.crossconnectionInv", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourceResponseProjection.crossconnectionInv", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.crossconnectionInv", 0) + 1);
            this.crossconnectionInv(new ResourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourceResponseProjection.crossconnectionInv", 0)));
        }
        this.resourceSpecification();
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourcePropertyResponseProjection.resourceProperties", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ResourcePropertyResponseProjection.resourceProperties", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourcePropertyResponseProjection.resourceProperties", 0) + 1);
            this.resourceProperties(new ResourcePropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ResourcePropertyResponseProjection.resourceProperties", 0)));
        }
        this.isDeleted();
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.NumericPoolResponseProjection.numericPool", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.NumericPoolResponseProjection.numericPool", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.NumericPoolResponseProjection.numericPool", 0) + 1);
            this.numericPools(new NumericPoolResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.NumericPoolResponseProjection.numericPool", 0)));
        }
        this.isEditable();
        if (projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ActionSchedulerResponseProjection.actionScheduler", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourceResponseProjection.ActionSchedulerResponseProjection.actionScheduler", projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ActionSchedulerResponseProjection.actionScheduler", 0) + 1);
            this.actionScheduler(new ActionSchedulerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourceResponseProjection.ActionSchedulerResponseProjection.actionScheduler", 0)));
        }
        this.typename();
        return this;
    }

    public ResourceResponseProjection id() {
        return id(null);
    }

    public ResourceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ResourceResponseProjection name() {
        return name(null);
    }

    public ResourceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ResourceResponseProjection available() {
        return available(null);
    }

    public ResourceResponseProjection available(String alias) {
        fields.add(new GraphQLResponseField("available").alias(alias));
        return this;
    }

    public ResourceResponseProjection externalId() {
        return externalId(null);
    }

    public ResourceResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ResourceResponseProjection lifecycleStatus() {
        return lifecycleStatus(null);
    }

    public ResourceResponseProjection lifecycleStatus(String alias) {
        fields.add(new GraphQLResponseField("lifecycleStatus").alias(alias));
        return this;
    }

    public ResourceResponseProjection planningSubStatus() {
        return planningSubStatus(null);
    }

    public ResourceResponseProjection planningSubStatus(String alias) {
        fields.add(new GraphQLResponseField("planningSubStatus").alias(alias));
        return this;
    }

    public ResourceResponseProjection administrativeSubStatus() {
        return administrativeSubStatus(null);
    }

    public ResourceResponseProjection administrativeSubStatus(String alias) {
        fields.add(new GraphQLResponseField("administrativeSubStatus").alias(alias));
        return this;
    }

    public ResourceResponseProjection operationalSubStatus() {
        return operationalSubStatus(null);
    }

    public ResourceResponseProjection operationalSubStatus(String alias) {
        fields.add(new GraphQLResponseField("operationalSubStatus").alias(alias));
        return this;
    }

    public ResourceResponseProjection usageSubStatus() {
        return usageSubStatus(null);
    }

    public ResourceResponseProjection usageSubStatus(String alias) {
        fields.add(new GraphQLResponseField("usageSubStatus").alias(alias));
        return this;
    }

    public ResourceResponseProjection belongsTo(ResourceResponseProjection subProjection) {
        return belongsTo(null, subProjection);
    }

    public ResourceResponseProjection belongsTo(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("belongsTo").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection composedOf(ResourceResponseProjection subProjection) {
        return composedOf(null, subProjection);
    }

    public ResourceResponseProjection composedOf(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("composedOf").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection locatedIn() {
        return locatedIn(null);
    }

    public ResourceResponseProjection locatedIn(String alias) {
        fields.add(new GraphQLResponseField("locatedIn").alias(alias));
        return this;
    }

    public ResourceResponseProjection physicalLink(ResourceResponseProjection subProjection) {
        return physicalLink(null, subProjection);
    }

    public ResourceResponseProjection physicalLink(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("physicalLink").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection physicalLinkInv(ResourceResponseProjection subProjection) {
        return physicalLinkInv(null, subProjection);
    }

    public ResourceResponseProjection physicalLinkInv(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("physicalLinkInv").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection logicalLinks(ResourceResponseProjection subProjection) {
        return logicalLinks(null, subProjection);
    }

    public ResourceResponseProjection logicalLinks(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("logicalLinks").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection logicalLinkInv(ResourceResponseProjection subProjection) {
        return logicalLinkInv(null, subProjection);
    }

    public ResourceResponseProjection logicalLinkInv(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("logicalLinkInv").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection crossConnection(ResourceResponseProjection subProjection) {
        return crossConnection(null, subProjection);
    }

    public ResourceResponseProjection crossConnection(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crossConnection").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection crossconnectionInv(ResourceResponseProjection subProjection) {
        return crossconnectionInv(null, subProjection);
    }

    public ResourceResponseProjection crossconnectionInv(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("crossconnectionInv").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection resourceSpecification() {
        return resourceSpecification(null);
    }

    public ResourceResponseProjection resourceSpecification(String alias) {
        fields.add(new GraphQLResponseField("resourceSpecification").alias(alias));
        return this;
    }

    public ResourceResponseProjection resourceProperties(ResourcePropertyResponseProjection subProjection) {
        return resourceProperties(null, subProjection);
    }

    public ResourceResponseProjection resourceProperties(String alias, ResourcePropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resourceProperties").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection isDeleted() {
        return isDeleted(null);
    }

    public ResourceResponseProjection isDeleted(String alias) {
        fields.add(new GraphQLResponseField("isDeleted").alias(alias));
        return this;
    }

    public ResourceResponseProjection numericPools(NumericPoolResponseProjection subProjection) {
        return numericPools(null, subProjection);
    }

    public ResourceResponseProjection numericPools(String alias, NumericPoolResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("numericPools").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection isEditable() {
        return isEditable(null);
    }

    public ResourceResponseProjection isEditable(String alias) {
        fields.add(new GraphQLResponseField("isEditable").alias(alias));
        return this;
    }

    public ResourceResponseProjection actionScheduler(ActionSchedulerResponseProjection subProjection) {
        return actionScheduler(null, subProjection);
    }

    public ResourceResponseProjection actionScheduler(String alias, ActionSchedulerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actionScheduler").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection changeItems(ChangeItemResponseProjection subProjection) {
        return changeItems(null, subProjection);
    }

    public ResourceResponseProjection changeItems(String alias, ChangeItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("changeItems").alias(alias).projection(subProjection));
        return this;
    }

    public ResourceResponseProjection typename() {
        return typename(null);
    }

    public ResourceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    public ResourceResponseProjection msg() {
        return this.msg((String)null);
    }



    public ResourceResponseProjection msg(String alias) {
        this.fields.add((new GraphQLResponseField("msg")).alias(alias));
        return this;
    }


}
