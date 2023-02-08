package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.List;
import java.util.StringJoiner;

@Data
public class SupportingResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("@baseType")
    @JsonAlias({"__typename", "@type"})
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Resource resourceRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ResourceReference resourceReferenceRef;

    @javax.validation.constraints.NotNull
    @JsonAlias({"id"})
    private String id;

    @JsonAlias({"name"})
    private String name;

    @JsonAlias({"href"})
    private String href;

    @JsonAlias({"type"})
    private String typeResourceRef;

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

    private java.util.Date createTime;

    private java.util.Date updateTime;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        if (type == null) {
            if (resourceRef != null) {
                joiner.add("resourceRef: " + GraphQLRequestSerializer.getEntry(resourceRef));
            }
            if (resourceReferenceRef != null) {
                joiner.add("resourceReferenceRef: " + GraphQLRequestSerializer.getEntry(resourceReferenceRef));
            }
        } else if (!type.equals("SupportingResource")) {
            if (id != null) {
                joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
            }
            if (type != null) {
                joiner.add("typename: " + GraphQLRequestSerializer.getEntry(type));
            }
            if (name != null) {
                joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
            }
            if (typeResourceRef != null) {
                joiner.add("type: " + GraphQLRequestSerializer.getEntry(typeResourceRef));
            }
            if (href != null) {
                joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
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
            if (isDeleted != null) {
                joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
            }

            if (createTime != null) {
                joiner.add("createTime: " + GraphQLRequestSerializer.getEntry(createTime));
            }
            if (updateTime != null) {
                joiner.add("updateTime: " + GraphQLRequestSerializer.getEntry(updateTime));
            }

        }
        return joiner.toString();
    }

}
