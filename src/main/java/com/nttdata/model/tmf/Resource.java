package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import javax.annotation.processing.Generated;
import java.util.List;
import java.util.StringJoiner;

@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
@Data
public class Resource {

    @javax.validation.constraints.NotNull
    @JsonInclude(Include.NON_NULL)
    @JsonAlias({"id"})
    private String id;

    @JsonAlias({"name"})
    private String name;

    @JsonAlias({"available"})
    private Boolean available;

    @JsonAlias({"externalId"})
    private String externalId;

    @JsonAlias({"lifecycleStatus"})
    private LifecycleStatus lifecycleStatus;

    @JsonAlias({"planningSubStatus"})
    private PlanningSubStatus planningSubStatus;

    @JsonAlias({"administrativeSubStatus"})
    private AdministrativeSubStatus administrativeSubStatus;

    @JsonAlias({"operationalSubStatus"})
    private OperationalSubStatus operationalSubStatus;

    @JsonAlias({"usageSubStatus"})
    private UsageSubStatus usageSubStatus;

    @JsonAlias({"belongsTo"})
    private Resource belongsTo;

    @JsonAlias({"composedOf"})
    private List<Resource> composedOf;

    @JsonAlias({"locatedIn"})
    private String locatedIn;

    @JsonAlias({"physicalLink"})
    private Resource physicalLink;

    @JsonAlias({"physicalLinkInv"})
    private Resource physicalLinkInv;

    @JsonAlias({"logicalLinks"})
    private List<Resource> logicalLinks;

    @JsonAlias({"logicalLinkInv"})
    private List<Resource> logicalLinkInv;

    @JsonAlias({"crossConnection"})
    private Resource crossConnection;

    @JsonAlias({"crossconnectionInv"})
    private Resource crossconnectionInv;

    @javax.validation.constraints.NotNull
    @JsonAlias({"resourceSpecification"})
    private String resourceSpecification;

    @JsonAlias({"resourceProperties"})
    private List<ResourceProperty> resourceProperties;

    @JsonAlias({"isDeleted"})
    private Boolean isDeleted;

    @JsonAlias({"numericPools"})
    private List<NumericPool> numericPools;

    private Boolean isEditable = true;

    private ActionScheduler actionScheduler;

    private List<ChangeItem> changeItems;

    @JsonInclude(Include.NON_NULL)
    private java.util.Date createTime;

    @JsonInclude(Include.NON_NULL)
    private java.util.Date updateTime;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }

        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }

        if (available != null) {
            joiner.add("available: " + GraphQLRequestSerializer.getEntry(available));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }

        if (lifecycleStatus != null) {
            joiner.add("lifecycleStatus: " + GraphQLRequestSerializer.getEntry(lifecycleStatus));
        }
        if (planningSubStatus != null) {
            joiner.add("planningSubStatus: " + GraphQLRequestSerializer.getEntry(planningSubStatus));
        }
        if (administrativeSubStatus != null) {
            joiner.add("administrativeSubStatus: " + GraphQLRequestSerializer.getEntry(administrativeSubStatus));
        }
        if (operationalSubStatus != null) {
            joiner.add("operationalSubStatus: " + GraphQLRequestSerializer.getEntry(operationalSubStatus));
        }
        if (usageSubStatus != null) {
            joiner.add("usageSubStatus: " + GraphQLRequestSerializer.getEntry(usageSubStatus));
        }

        if (belongsTo != null) {
            joiner.add("belongsTo: " + GraphQLRequestSerializer.getEntry(belongsTo));
        }
        if (composedOf != null) {
            joiner.add("composedOf: " + GraphQLRequestSerializer.getEntry(composedOf));
        }
        if (locatedIn != null) {
            joiner.add("locatedIn: " + GraphQLRequestSerializer.getEntry(locatedIn));
        }
        if (physicalLink != null) {
            joiner.add("physicalLink: " + GraphQLRequestSerializer.getEntry(physicalLink));
        }
        if (physicalLinkInv != null) {
            joiner.add("physicalLinkInv: " + GraphQLRequestSerializer.getEntry(physicalLinkInv));
        }
        if (logicalLinks != null) {
            joiner.add("logicalLinks: " + GraphQLRequestSerializer.getEntry(logicalLinks));
        }
        if (logicalLinkInv != null) {
            joiner.add("logicalLinkInv: " + GraphQLRequestSerializer.getEntry(logicalLinkInv));
        }
        if (crossConnection != null) {
            joiner.add("crossConnection: " + GraphQLRequestSerializer.getEntry(crossConnection));
        }
        if (crossconnectionInv != null) {
            joiner.add("crossconnectionInv: " + GraphQLRequestSerializer.getEntry(crossconnectionInv));
        }
        if (resourceSpecification != null) {
            joiner.add("resourceSpecification: " + GraphQLRequestSerializer.getEntry(resourceSpecification));
        }

        if (resourceProperties != null) {
            joiner.add("resourceProperties: " + GraphQLRequestSerializer.getEntry(resourceProperties));
        }

        if (numericPools != null) {
            joiner.add("numericPools: " + GraphQLRequestSerializer.getEntry(numericPools));
        }

        if (isEditable != null) {
            joiner.add("isEditable: " + GraphQLRequestSerializer.getEntry(isEditable));
        }

        if (isDeleted != null) {
            joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
        }

        if (actionScheduler != null) {
            joiner.add("actionScheduler: " + GraphQLRequestSerializer.getEntry(actionScheduler));
        }

        if (changeItems != null) {
            joiner.add("changeItems: " + GraphQLRequestSerializer.getEntry(changeItems));
        }

        if (createTime != null) {
            joiner.add("createTime: " + GraphQLRequestSerializer.getEntry(createTime));
        }
        if (updateTime != null) {
            joiner.add("updateTime: " + GraphQLRequestSerializer.getEntry(updateTime));
        }

        return joiner.toString();
    }
}
